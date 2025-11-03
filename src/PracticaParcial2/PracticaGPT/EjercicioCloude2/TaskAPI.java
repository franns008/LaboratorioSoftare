package PracticaParcial2.PracticaGPT.EjercicioCloude2;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

@RestAPI(
        baseURL = "/hola",
        puerto = 8045,
        maxConnections = 2
)
public class TaskAPI {
    private List<String> listaTareas = List.of("A1","T2","T3");
    @Endpoint(path = "/getTasks",method = "POST")
    public void metodo(HttpExchange exchange) throws IOException {
        byte[] bytes = exchange.getRequestBody().readAllBytes();
        String a =bytes.toString();
        this.listaTareas.add(a);
        String msj = "añadiste bien la tarea capo!";
        exchange.sendResponseHeaders(200,msj.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(msj.getBytes());
        os.close();
    }

    @Endpoint(path = "/tasks",method = "GET")
    public void metodo2(HttpExchange exchange) throws IOException {

        String msj = this.listaTareas.stream()
                .collect(Collectors.joining("\n"));

        exchange.sendResponseHeaders(200,msj.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(msj.getBytes());
        os.close();
    }
    @Endpoint(path = "/tasks/count",method = "GET")
    public void cantidad(HttpExchange exchange) throws IOException {
        String msj = "Cantidad de tareas" +this.listaTareas.size();
        exchange.sendResponseHeaders(200,msj.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(msj.getBytes());
        os.close();
    }
}
