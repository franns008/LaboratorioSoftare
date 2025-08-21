package Practica1.Ejercicio4;

public class Logger {
    private static Logger instancia;

    private Logger(){

    }

    public static Logger  getLogger(){
        if(Logger.instancia==null){
            instancia=new Logger();
        }
        return instancia;
    }

    public void logInfo(String mensaje){
        System.out.println("{info} "+mensaje);
    }

    public void logError(String mensaje){
        System.out.println("{error} "+mensaje);
    }

    public void logWarning(String mensaje){
        System.out.println("{warning} "+mensaje);
    }
}
