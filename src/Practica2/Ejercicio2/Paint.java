package Practica2.Ejercicio2;

import Practica1.Ejercicio5.Circulo;
import Practica1.Ejercicio5.FiguraGeometrica;
import Practica1.Ejercicio5.Rectangulo;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Practica1.Ejercicio5.FiguraGeometrica> figuras;

    public Paint(){
        this.figuras = new ArrayList<>();
    }

    public void setPaleta(Practica1.Ejercicio5.FiguraGeometrica paleta){
        this.figuras.add(paleta);
    }

    public ArrayList<FiguraGeometrica> getPaleta(){
        return this.figuras;
    }

    public void init(){
        this.figuras.add(new Practica1.Ejercicio5.Circulo("azul",2));
        this.figuras.add(new Circulo("azul",3));
        this.figuras.add(new Rectangulo("verde",2,3));
        this.figuras.add(new Rectangulo("rojo",4,10));
    }

}
