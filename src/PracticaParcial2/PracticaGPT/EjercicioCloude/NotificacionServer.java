package PracticaParcial2.PracticaGPT.EjercicioCloude;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotificacionServer {
    int puerto() default 8080;
    String logFile() default  "notifications.log";
}
