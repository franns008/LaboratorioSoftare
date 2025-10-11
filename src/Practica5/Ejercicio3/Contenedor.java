package Practica5.Ejercicio3;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Contenedor {

    public static void main(String[] args) {
        try {
            Class<?> implementacionServidor = ImplementacionServidor.class;
            Servidor s = implementacionServidor.getAnnotation(Servidor.class);

            System.out.println("Servidor iniciado en:");
            System.out.println("→ Dirección: " + s.direccion());
            System.out.println("→ Puerto: " + s.puerto());
            System.out.println("→ Log: " + s.archivo());

            Object instancia = implementacionServidor.getDeclaredConstructor().newInstance();

            try (ServerSocket serverSocket = new ServerSocket(s.puerto())) {
                System.out.println("Esperando conexiones...");


                while (true) {
                    Socket cliente = serverSocket.accept();

                    String ipCliente = cliente.getInetAddress().getHostAddress();
                    System.out.println("Cliente conectado desde: " + ipCliente);

                    try (FileWriter fw = new FileWriter(s.archivo(), true);
                         BufferedWriter bw = new BufferedWriter(fw)) {
                        bw.write(LocalDateTime.now() + " - Cliente desde: " + ipCliente + "\n");
                    }

                    for (Method m : implementacionServidor.getDeclaredMethods()) {
                        if (m.isAnnotationPresent(Invocar.class)) {
                            if (m.getParameterCount() == 0) {
                                m.invoke(instancia);
                            } else if (m.getParameterCount() == 1) {
                                m.invoke(instancia, "Mensaje recibido desde " + ipCliente);
                            } else if (m.getParameterCount() == 3) {
                                m.invoke(instancia, "Hola", ipCliente, 1);
                            }
                        }
                    }

                    try (PrintWriter out = new PrintWriter(cliente.getOutputStream())) {
                        out.println("HTTP/1.1 200 OK");
                        out.println("Content-Type: text/html");
                        out.println("<h1>FELICIDADES! se ejecuto correctamente</h1>");
                        out.println("<p>Invocaciones ejecutadas correctamente.</p>");
                    }

                    cliente.close();
                }
            }

        } catch (IOException | InstantiationException | IllegalAccessException |
                 InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
