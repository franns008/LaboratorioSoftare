package Practica5.Ejercicio3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Contenedor {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        StringBuilder textoImprimir = new StringBuilder();
        Class<?> implementacionServidor = ImplementacionServidor.class;
        Servidor s = implementacionServidor.getAnnotation(Servidor.class);
        textoImprimir.append("Direccion "+s.direccion());
        textoImprimir.append("Puerto "+s.puerto());
        textoImprimir.append("Archivo "+s.archivo());
        Object instancia = implementacionServidor.getDeclaredConstructor().newInstance();

        // recorrer todos los métodos
        for (Method m : implementacionServidor.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Invocar.class)) {

                // mostrar nombre del método
                System.out.println("Invocando: " + m.getName());

                // según los parámetros del método, invocar con distintos valores de prueba
                Class<?>[] params = m.getParameterTypes();

                if (params.length == 3) {
                    m.invoke(instancia, "Hola mundo", "Fran", 1);
                } else if (params.length == 1) {
                    m.invoke(instancia, "Otro mensaje");
                } else if (params.length == 0) {
                    m.invoke(instancia);
                }
            }
        }

        try (BufferedWriter file = new BufferedWriter(new FileWriter(s.archivo()))){
            file.write(textoImprimir.toString());
            System.out.println("archivo Creado");
        }catch (Exception e){
            System.err.println("error en el archivo");
        }



    }

}
