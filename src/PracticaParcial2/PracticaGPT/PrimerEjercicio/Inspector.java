package PracticaParcial2.PracticaGPT.PrimerEjercicio;

import java.util.ArrayList;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
Implementá una clase Inspector que reciba por consola el nombre completo
de una clase (por ejemplo "java.util.ArrayList") y:

Liste todos sus atributos (nombre y tipo).

Liste todos sus métodos públicos
(nombre, tipo de retorno y parámetros).

Liste todas las interfaces que implementa.

Indique si es una clase abstracta, final o una interfaz
 */
public class Inspector {

    public static void metodoAInspeccionar(){
        Class<?> claseARevisar;
        try {
            claseARevisar = Class.forName("Practica4.Ejercicio1.Alumno");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Object instancia;
        try{
            instancia = claseARevisar.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            instancia = null;
            System.out.println(" No tengo constructor ");
        }
        Field[] campos = claseARevisar.getFields();
        for (Field f : campos){
            try {
                System.out.println("Nombre de metodo "+f.getName()+" valor "+f.get(instancia));
            } catch (IllegalAccessException e) {
                System.out.println("che puede ser que las variables" +
                        "no hayan sido inicializadas");
            }

        }
        Method[]metodos = claseARevisar.getMethods();
        for(Method m : metodos){
            System.out.println("Nombre "+m.getName()+
                    " tipo de retornos "+m.getReturnType());
            System.out.println("Parametros "+ Arrays.stream(m.getParameterTypes())
                    .map(p -> p.getName())
                    .collect(Collectors.joining(", ")));
        }
        Class[] interfaces = claseARevisar.getInterfaces();
        for (Class i : interfaces){
            if (i.isInterface())
            {
                System.out.println("La clase implementa la interfaz "+i.getName());
            }
        }
        int mods = claseARevisar.getModifiers();
        System.out.println("Es abstracta: " + Modifier.isAbstract(mods));
        System.out.println("Es final: " + Modifier.isFinal(mods));
        System.out.println("Es interfaz: " + claseARevisar.isInterface());

    }


    public static void main(String[] args) {
        metodoAInspeccionar();
    }
}
