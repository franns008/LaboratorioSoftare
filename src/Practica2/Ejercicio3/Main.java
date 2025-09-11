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

        HashSetAgregadosMia<Integer> hashSetMia = new HashSetAgregadosMia<>();
        hashSetMia.add(7);
        hashSetMia.add(8);
        hashSetMia.add(6);
        hashSetMia.add(6);
        System.out.println("Cantidad de elementos agregados "+hashSetMia.getCantidadAgregados());
        hashSetMia.addAll(lista);
        System.out.println("Cantidad de elementos agregados "+hashSetMia.getCantidadAgregados());

    }
}
