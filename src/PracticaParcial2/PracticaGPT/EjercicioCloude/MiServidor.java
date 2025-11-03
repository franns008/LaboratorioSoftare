package PracticaParcial2.PracticaGPT.EjercicioCloude;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

@NotificacionServer(
        puerto = 1870,
        logFile = "ArchivoSalidaDeLogs.log"
)
public class MiServidor {
    @notifyClient
    public String enviarMensajeDeBienvenida(){
        return "¡Bienvenido al Servidor!";
    }

    @notifyClient
    public String obtenerFechaHora(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
