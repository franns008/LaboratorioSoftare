package PracticaParcial2.PracticaGPT.EjercicioCloude;

import PracticaParcial2.Practica5.Servidor;
import PracticaParcial2.PracticaGPT.EjercicioCloude.MiServidor;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContenedorModificaciones {
    public static void main(String[] args)  {
        MiServidor miServidor = new MiServidor();
        HttpServer server;
        int puerto = miServidor.getClass().getAnnotation(NotificacionServer.class).puerto();
        String filePath = miServidor.getClass().getAnnotation(NotificacionServer.class).logFile();
        try {
            server = HttpServer.create(new InetSocketAddress(puerto),0);
            server.createContext("/", exchange -> {
                try{
                    FileWriter file = new FileWriter(filePath,true);
                    file.write(exchange.getRemoteAddress().toString()+" horario "+
                            LocalDateTime.now());
                    file.close();
                    Method[] metodos = miServidor.getClass().getDeclaredMethods();
                    StringBuilder msj=new StringBuilder();
                    for(Method m: metodos){
                        if (m.isAnnotationPresent(notifyClient.class)){
                            msj.append(m.invoke(miServidor).toString());
                        }
                    }
                    exchange.sendResponseHeaders(200,msj.toString().getBytes().length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(msj.toString().getBytes());
                    os.close();
                }catch (Exception e){
                    System.out.println("Hubo un error");
                }

            });
            server.start();

        }catch (Exception e){
            System.out.println("Matate, se rompio algo");
        }

    }


 }


