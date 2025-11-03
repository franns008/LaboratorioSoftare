package PracticaParcial2.PracticaGPT.EjercicioCloude2;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;

public class ContenedorRest {
    public static void main(String[] args) {

        TaskAPI api = new TaskAPI();
        HttpServer server;
        String baseUrl = api.getClass().getAnnotation(RestAPI.class).baseURL();
        int puerto = api.getClass().getAnnotation(RestAPI.class).puerto();
        int maxCon = api.getClass().getAnnotation(RestAPI.class).maxConnections();
        try {
            server = HttpServer.create(new InetSocketAddress(puerto),maxCon);
            Method[] metodos = api.getClass().getDeclaredMethods();
            for(Method m : metodos){
                if (m.isAnnotationPresent(Endpoint.class)){
                    Endpoint end = m.getAnnotation(Endpoint.class);
                    server.createContext(baseUrl + end.path(), new HttpHandler() {
                        @Override
                        public void handle(HttpExchange exchange) throws IOException {
                            try {
                                m.invoke(api,exchange);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            } catch (InvocationTargetException e) {
                                throw new RuntimeException(e);
                            }

                        }
                    });

                }
            }
            server.start();

        }catch (Exception e){
            System.out.println("Error mal ahi");
            e.printStackTrace();
        }

    }
}
