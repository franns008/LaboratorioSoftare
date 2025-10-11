package Practica5.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

@Servidor(
        direccion = "127.0.0.1",
        puerto = 8765,
        archivo = "archivoRaro.txt"
)
public class ImplementacionServidor{
    private String usuario;
    private List<String> mensaje ;
    private int id;

    public ImplementacionServidor(){
        this.mensaje = new ArrayList<>();
    }

    @Invocar
    public void concetar(String mensaje,String usuario,int id){
        this.id = id;
        this.mensaje.add(mensaje);
        this.usuario = usuario;
        System.out.println("Id: "+id+" usuario "+usuario+" mensaje "+mensaje);
    }

    @Invocar
    public void masMensajes(String mensaje){
        this.mensaje.add(mensaje);
        System.out.println("Mensaje "+mensaje);
    }

    @Invocar
    public void todosLosMensajes(){
        for(String s : mensaje){
            System.out.println(s);
        }
    }

}
