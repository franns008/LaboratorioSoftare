package Practica2.Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashSetAgregados<Integer> hashSet = new HashSetAgregados<Integer>();
        hashSet.add(8);
        hashSet.add(7);
        hashSet.add(9);
        System.out.println("Cantidad de elementos agregados " + hashSet.getCantidadAgregados());
        HashSetAgregados<Integer> hashSet2 = new HashSetAgregados<Integer>();
        ArrayList<Integer> lista =new ArrayList();
        lista.add(7);
        lista.add(2);
        lista.add(45);
        hashSet2.addAll(lista);
        System.out.println("Cantidad de elementos agregados " + hashSet2.getCantidadAgregados());

    }
}
