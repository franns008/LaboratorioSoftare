package PracticaParcial.EjercicioIntegrador.FigurasGeometricasAv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Paint {
    private List<Figura> l;

    public Paint() {
        this.l = new ArrayList<>();
    }

    public void addFigura (Figura f){
        this.l.add(f);
    }

    public List<Figura> ordenarPorArea(){
        ArrayList<Figura> copia = new ArrayList<>(l);
        copia.sort(new Comparator<Figura>() {
            @Override
            public int compare(Figura o1, Figura o2) {
                return Double.compare(o1.area(),o2.area());
            }
        });
        return l;
    }
}
