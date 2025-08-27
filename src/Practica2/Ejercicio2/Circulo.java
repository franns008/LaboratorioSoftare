package Practica2.Ejercicio2;


import Practica2.Ejercicio2.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }

    @Override
    public int area() {
        long round =Math.round(Math.PI * radio * radio);
        return Math.toIntExact(round);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un ciculo con radio "+this.radio+" y color "+this.getColor());
    }
}
