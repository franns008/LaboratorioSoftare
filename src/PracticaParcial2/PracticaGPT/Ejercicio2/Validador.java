package PracticaParcial2.PracticaGPT.Ejercicio2;

import java.lang.reflect.*;
import java.util.Arrays;

public class Validador {

    public static void validar (Object obj){
        Class claseAEvaluar = obj.getClass();
        Field[] campos = claseAEvaluar.getDeclaredFields();
        for (Field c : campos){
            c.setAccessible(true);
            if (c.isAnnotationPresent(Requerido.class)){
                try{
                    if(c.get(obj) == null || (c.getType().equals(String.class) && ((String) c.get(obj)).isEmpty())){
                        System.out.println("El campo "+c.getName()+" No cumple con las condiciones de la anotacion");
                    }
                    if ((c.getType().equals(String.class)) && c.isAnnotationPresent(LongitudMaxima.class)) {
                        String cadena = (String) c.get(obj);
                        if (cadena.length() > c.getAnnotation(LongitudMaxima.class).longitudMaxima()){
                            System.out.println("La cadena es mas grande que la longitud maxima");
                        }
                    }
                    
                } catch (IllegalAccessException e) {
                    System.out.println("Error al acceder al sistema");
                }
                
            }
            
        }
    }
}

/*
Enunciado:

Definir las siguientes anotaciones personalizadas:

@Requerido
Indica que el atributo no puede ser nulo ni vacío.

@LongitudMaxima(int valor)
Indica la cantidad máxima de caracteres permitidos para un campo de tipo String.
Implementar una clase llamada Validador que contenga un método estático validar
El método debe:

Obtener la clase del objeto recibido usando reflexión (obj.getClass()).

Recorrer todos sus atributos, incluso los private.

Para cada atributo:

Si está anotado con @Requerido, verificar que su valor no sea null ni una cadena vacía.

Si está anotado con @LongitudMaxima, verificar que la longitud del texto no supere el valor indicado en la anotación.

Mostrar por consola los resultados de las validaciones, indicando si el objeto cumple o no con las restricciones.

 */