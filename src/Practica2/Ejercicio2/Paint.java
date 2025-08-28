package Practica2.Ejercicio2;

import Practica2.Ejercicio2.*;

import java.util.ArrayList;

public class Paint {
    private FiguraGeometrica[] figuras;
    private int cant;
    private int limit;

    public Paint(){
        limit = 100;
        cant = 0;
        this.figuras = new FiguraGeometrica[4];
    }

    public void addPaleta(FiguraGeometrica figura){
        if(cant< limit) {
            this.figuras[cant] = figura;
            cant++;
        }
    }

    public FiguraGeometrica[] getPaleta(){
        return this.figuras;
    }

    public void init(){
        this.addPaleta(new Circulo("azul",2));
        this.addPaleta(new Circulo("azul",3));
        this.addPaleta(new Rectangulo("verde",2,3));
        this.addPaleta(new Rectangulo("rojo",4,10));
    }

}
