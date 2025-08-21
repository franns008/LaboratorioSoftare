package Practica1.Ejercicio5;

import java.util.*;

public class Paint {
    private List<FiguraGeometrica> figuras;

    public Paint(){

    }

    public void setPaleta(FiguraGeometrica paleta){
        this.figuras.add(paleta);
    }

    public List<FiguraGeometrica> getPaleta(){
        return this.figuras;
    }


}
