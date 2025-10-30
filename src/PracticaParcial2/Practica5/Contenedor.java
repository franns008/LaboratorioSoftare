package PracticaParcial2.Practica5;

import PracticaParcial2.Practica5.Invocar;
import PracticaParcial2.Practica5.Servidor;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Contenedor {
    public static void main(String[] args) throws IllegalAccessException {
        Class<?> clasePrueba = null;
        try{
            clasePrueba = Class.forName("PracticaParcial2.Practica5.ClasePrueba");
        }catch(Exception e){
            System.out.println("Hubo un error: "+e.getMessage());
        }
        Object instancia = null;
        try {
            instancia = clasePrueba.getConstructor().newInstance();
        }catch (Exception e){
            System.out.println("Error en instancia");
        }

        if (clasePrueba.isAnnotationPresent(Servidor.class)) {
            Servidor s = clasePrueba.getAnnotation(Servidor.class);
            String dir = s.direccion();
            int puerto = s.puerto();
            String arch = s.archivo();
            HttpServer server = null;
            try{
                server = HttpServer.create(new InetSocketAddress(dir,puerto),0);
            }catch (Exception e){
                System.out.println("Error al arrancar el server"+e.getMessage());
            }
            FileWriter file = null;
            try {
                file = new FileWriter(arch);
                file.write("Fecha y hora: "+LocalDateTime.now().toString()+"\n");
                file.write("IP "+dir);
                file.close();
            } catch (IOException e) {
                System.out.println("Error al arrancar al archivo: "+e.getMessage());
            }
            Method[] campos = clasePrueba.getDeclaredMethods();

            HttpHandler handler;
            ArrayList<Method> metodosAInvocar = new ArrayList<>();
            for(Method m : campos){
                if(m.isAnnotationPresent(Invocar.class)){
                    metodosAInvocar.add(m);
                }
            }
            Object finalInstancia = instancia;
            handler = new HttpHandler() {
                @Override
                public void handle(HttpExchange exchange) throws IOException {
                    StringBuilder respuesta = new StringBuilder("El servidor está andando!\n");

                    for (Method m : metodosAInvocar) {
                        try {
                            Object r = m.invoke(finalInstancia);
                            if (r != null)
                                respuesta.append(r.toString()).append("\n");
                        } catch (Exception e) {
                            respuesta.append("Error en ").append(m.getName())
                                    .append(": ").append(e.getMessage()).append("\n");
                        }
                    }

                    byte[] bytes = respuesta.toString().getBytes();
                    exchange.getResponseHeaders().set("Content-type","text/html; charset=UTF-8");
                    exchange.sendResponseHeaders(200, bytes.length);
                    exchange.getResponseBody().write(bytes);
                    exchange.getResponseBody().close();
                }
            };
            server.createContext("/",handler);
            server.start();

        }
    }
}
