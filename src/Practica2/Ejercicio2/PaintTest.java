package Practica2.Ejercicio2;

import Practica2.Ejercicio2.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();
        FiguraGeometrica[] lista = paint.getPaleta();
        for (int i = 0; i < 4; i++) {
            System.out.println("area "+lista[i].area());
        }
        Arrays.sort(lista); // usa compareTo
        System.out.println("\nDespués de ordenar:");
        for (int i = 0; i < 4; i++) {
            System.out.println("area "+lista[i].area());
        }
    }
}
