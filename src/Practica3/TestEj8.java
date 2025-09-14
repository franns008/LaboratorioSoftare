package Practica3;

import Practica3.Ejercicio8.Musico;
import Practica3.Ejercicio8.Notas;

import java.util.ArrayList;

public class TestEj8 {

    public static void main(String[] args) {
        ArrayList<Notas> a = new ArrayList<>();
        ArrayList<Integer> ai = new ArrayList<>();
        a.add(Notas.FA);
        ai.add(2);
        a.add(Notas.DO);
        ai.add(4);
        a.add(Notas.RE);
        ai.add(8);
        a.add(Notas.MI);
        ai.add(2);
        a.add(Notas.FA);
        Musico.FITOPAEZ.tocarCancion(a,ai);
    }
}
