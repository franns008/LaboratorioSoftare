package PracticaParcial.EjerciciosExtra;

import java.util.ArrayList;
import java.util.List;

public class LoggerAvanzado {
    private static LoggerAvanzado l;
    private List<String> mensajes;

    private LoggerAvanzado(){
        this.mensajes = new ArrayList<>();
    }

    public static LoggerAvanzado getLoggerAvanzado(){
        if(l == null){
            l = new LoggerAvanzado();
        }
        return l;
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
