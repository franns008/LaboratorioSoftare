package Practica2.Ejercicio3BienHecho;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashSetAgregados hash = new HashSetAgregados();
        hash.add("hola");
        hash.add("chau");
        ArrayList<String> ar = new ArrayList<>();
        ar.add("a");
        ar.add("b");
        System.out.println("Cantidad elementos "+hash.getCantidadAgregados());
        hash.addAll(ar);
        System.out.println("Cant elementos "+hash.getCantidadAgregados());
    }
}
