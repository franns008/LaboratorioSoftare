package Practica2.Ejercicio2;

import Practica1.Ejercicio5.FiguraGeometrica;
import Practica1.Ejercicio5.Paint;

import java.util.ArrayList;

public class PaintTest {
    public static void main(String[] args) {
        Practica1.Ejercicio5.Paint paint = new Paint();
        paint.init();
        ArrayList<FiguraGeometrica> lista = paint.getPaleta();
        for (int i = 0; i < 4; i++) {
            lista.get(i).dibujar();
        }
    }
}
