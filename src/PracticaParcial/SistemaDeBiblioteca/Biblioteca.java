package PracticaParcial.SistemaDeBiblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {
    private List<MaterialBiblioteca> estanteria;

    public Biblioteca(){
        this.estanteria = new ArrayList<>();
    }

    public void add(MaterialBiblioteca ma){
        this.estanteria.add(ma);
    }

    public Iterator<MaterialBiblioteca> getIterator(){
        return  new IteradorMateriales();
    }

    public List<MaterialBiblioteca> ordenarPorAño(Comparator<MaterialBiblioteca> m){
        ArrayList<MaterialBiblioteca> l = new ArrayList<>(estanteria);
        l.sort(m);
        return l;
    }

    private class IteradorMateriales implements Iterator<MaterialBiblioteca>{
        private int pos = 0;
        private int cantTotal = estanteria.size();

        @Override
        public boolean hasNext() {
            return pos<cantTotal;
        }

        @Override
        public MaterialBiblioteca next() {
            MaterialBiblioteca m = estanteria.get(pos);
            pos++;
            return m;
        }
    }
}
