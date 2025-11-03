package PracticaParcial2.PracticaGPT.EjercicioCloude2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.classfile.TypeAnnotation;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RestAPI {
    String baseURL() default "/api";
    int puerto();
    int maxConnections();
}
