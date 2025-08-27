package Practica2.Ejercicio2.;

import Practica2.Ejercicio2.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {
    private int alto;
    private int ancho;

    public Rectangulo(String color, int alto, int ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public int area() {
        return  ancho*alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un cuadrado de area "+this.area()+" de color "+this.getColor());
    }

}
