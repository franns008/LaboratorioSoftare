package PracticaParcial.EjerciciosExtra;

import java.util.ArrayList;
import java.util.List;

public class LoggerAvanzadoV2 {
    public static final LoggerAvanzadoV2 l = new LoggerAvanzadoV2();
    private List<String> mensajes;

    private LoggerAvanzadoV2(){
        this.mensajes = new ArrayList<>();
    }


    public void logInfo(String s){
        this.mensajes.add("Info "+s);
    }
    public void logWarning(String s){
        this.mensajes.add("Warning "+s);
    }
    public void  logError(String s){
        this.mensajes.add("Error "+s);
    }

    public void printAll(){
        for(String s : mensajes){
            System.out.println(s);
        }
    }
}