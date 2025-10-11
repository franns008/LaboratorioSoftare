package Practica5.Ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Procesador {

    public static void main(String[] args) {
        Class<?> claseBean;
        try {
            claseBean = Class.forName(args[0]);
        } catch (Exception e) {
            System.out.println("No encontre la clase");
            return;
        }

        if (claseBean.isAnnotationPresent(Archivo.class)) {
            StringBuilder textoImprimir = new StringBuilder();
            Archivo a = claseBean.getAnnotation(Archivo.class);
            String archivo = (a.name() != null && !a.name().isEmpty()) ? a.name() : claseBean.getSimpleName() + ".txt";

            textoImprimir.append("<nombreClase>").append(claseBean.getSimpleName()).append("</nombreClase>\n");

            try {
                Object instancia = claseBean.getDeclaredConstructor().newInstance();

                for (Field f : claseBean.getDeclaredFields()) {
                    if (f.isAnnotationPresent(AlmacenarAtributo.class)) {
                        f.setAccessible(true); // permitir acceso a campos privados
                        Object valor = f.get(instancia);

                        textoImprimir.append("<nombreAtributo>")
                                .append(f.getName())
                                .append("</nombreAtributo>\n");
                        textoImprimir.append("<valorAtributo>")
                                .append(valor)
                                .append("</valorAtributo>\n");
                    }
                }

                try (BufferedWriter file = new BufferedWriter(new FileWriter(archivo))) {
                    file.write(textoImprimir.toString());
                    System.out.println("Archivo creado exitosamente en: " + archivo);
                }

            } catch (Exception e) {
                System.err.println("Error al procesar los campos: " + e.getMessage());
            }
        }
    }
}
