package Practica1.Ejercicio5;

import java.util.*;

public class Paint {
    private ArrayList<FiguraGeometrica> figuras;

    public Paint(){
        this.figuras = new ArrayList<>();
    }

    public void setPaleta(FiguraGeometrica paleta){
        this.figuras.add(paleta);
    }

    public ArrayList<FiguraGeometrica> getPaleta(){
        return this.figuras;
    }

    public void init(){
        this.figuras.add(new Circulo("azul",2));
        this.figuras.add(new Circulo("azul",3));
        this.figuras.add(new Rectangulo("verde",2,3));
        this.figuras.add(new Rectangulo("rojo",4,10));
    }

}
