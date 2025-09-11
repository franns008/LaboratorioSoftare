package loggingutils;

import java.util.logging.Handler;
import java.util.logging.Level;

public class Logger {
    private static java.util.logging.Logger instancia  = java.util.logging.Logger.getLogger("logger");

    public void logInfo(String mensaje){
        instancia.log(Level.INFO,mensaje);
    }

    public void logError(String mensaje){
        instancia.log(Level.SEVERE, mensaje);
    }

    public void logWarning(String mensaje){
        instancia.log(Level.WARNING,mensaje);
    }
}
