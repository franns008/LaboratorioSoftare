package PracticaParcial2.Practica5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Array;

public class Mapper {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Class<?> claseBean = null;
        try {
            claseBean = Class.forName("PracticaParcial2.Practica5.Bean");
        } catch (Exception e) {
            System.out.println("Pusiste cualquier clase, mal ahi");
        }
        if (claseBean.isAnnotationPresent(Archivo.class)){
            StringBuilder string = new StringBuilder();
            Archivo a = claseBean.getAnnotation(Archivo.class);
            string.append("<NombeClase>"+a.name()+"</NombeClase>\n");
            Field[] fields = claseBean.getDeclaredFields();
            Object instancia=null;
            try {
                instancia = claseBean.getDeclaredConstructor().newInstance();
            }catch (Exception e){
                System.out.println("Paso algo, fijate"+e.getMessage());
            }
            for(Field f : fields){
                if(f.isAnnotationPresent(AlmacenarAtributo.class)){
                    f.setAccessible(true);
                    string.append("<nombreAtributo>"+f.getName()+"</nombreAtributo>\n");
                    string.append("<nombreValor>"+f.get(instancia)+"</nombreValor>\n");
                }
            }
            BufferedWriter file = new BufferedWriter(new FileWriter("ArchivoSalida"));
            file.write(string.toString());
            file.close();
        }
    }


}
