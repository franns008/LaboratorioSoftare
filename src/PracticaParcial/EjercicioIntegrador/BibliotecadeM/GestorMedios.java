package PracticaParcial.EjercicioIntegrador.BibliotecadeM;

import PracticaParcial.EjerciciosExtra.SistemaDeUsuarios.GestorUsuarios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorMedios {
    private List<Medio> lM;

    public GestorMedios(){
        lM = new ArrayList<>();
    }

    public void add (Medio m){
        this.lM.add(m);
    }

    public Iterator<Medio> getIterator(){
        return new IteratorMedio();
    }

    private class IteratorMedio implements Iterator<Medio> {
        private int cant = lM.size();
        private int pos = 0;


        @Override
        public boolean hasNext() {
            return pos<cant;
        }

        @Override
        public Medio next() {
            Medio m = lM.get(pos);
            pos++;
            return m;
        }
    }

}
