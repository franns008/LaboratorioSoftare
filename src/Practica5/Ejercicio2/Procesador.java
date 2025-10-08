package Practica5.Ejercicio2;

import jdk.jfr.AnnotationElement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Procesador {

    public static void main(String[] args) {
        Class<?> claseBean;
        try {
             claseBean = Class.forName(args[0]);
        }
        catch (Exception e){
            System.out.println("No encontre la clase");
            return ;
        }
        if(claseBean.isAnnotationPresent(Archivo.class)) {
            String textoImprimir = "";
            Archivo a = claseBean.getAnnotation(Archivo.class);
            String archivo;
            if (a.name() != null) {
                archivo = a.name();
                textoImprimir += "<nombreClase>" + a.name() + "</nombreClase>" + "\n";
            } else {
                archivo = claseBean.getName();
                textoImprimir += "<nombreClase>" + ReflectPermission.class.getName() + "</nombreClase>" + "\n";
            }
            for  (Field f : claseBean.getDeclaredFields()) {
                if (f.isAnnotationPresent(AlmacenarAtributo.class)){
                    textoImprimir += "<nombreAtributo>"+f.getName()+"<nombreAtributo>"+"\n";
                    textoImprimir += "<valorAtributo>"+f.toString()+"<valorAtributo>"+"\n";
                }
            }

            try {
                BufferedWriter file;
                file = new BufferedWriter(new FileWriter(archivo));
                System.out.println("Archivo creado exitosamente en: " + archivo);
            } catch (IOException e) {
                System.err.println("Error al crear el archivo: " + e.getMessage());
            }
        }


    }

}
