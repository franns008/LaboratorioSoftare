package Practica1.Ejercicio5;

import java.util.*;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();
        ArrayList<FiguraGeometrica> lista = paint.getPaleta();
        for (int i = 0; i < 4; i++) {
            lista.get(i).dibujar();
        }
    }
}
