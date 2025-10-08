package PracticaParcial.ReHacerP3.Ej6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("fran", "Suarez", 20, 21011,8);
        Estudiante e2 = new Estudiante("juan", "Rodriguez", 24, 245451,6);
        Estudiante e3 = new Estudiante("matias ", "hernandez", 19, 124441,10);
        Estudiante e4 = new Estudiante("matias ", "hernandez", 19, 124441,6);
        List<Estudiante> lista = new ArrayList<>();
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        for(Estudiante e : lista){
            System.out.println(e.toString());
        }
        lista.sort(e1.getComparadorPorMaterias());
        System.out.println("Lista ordenada por Materias ");
        for(Estudiante e : lista){
            System.out.println(e.toString());
        }
        System.out.println("Lista ordenada por nombre");
        lista.sort(e1.getComparadorPorNombre());
        for(Estudiante e : lista){
            System.out.println(e.toString());
        }
        System.out.println("Lista ordenada por legajo");
        lista.sort(e1.getComparadorPorLegajo());
        for(Estudiante e : lista){
            System.out.println(e.toString());
        }
        System.out.println("Lista ordenada por edad");
        lista.sort(e1.getComparadorPorEdad());
        for(Estudiante e : lista){
            System.out.println(e.toString());
        }

    }

}
