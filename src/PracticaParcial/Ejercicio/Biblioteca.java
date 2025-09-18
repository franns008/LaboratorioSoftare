package PracticaParcial.Ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca implements Iterable<Documento> {
    List<Documento> estante;

    public Biblioteca(){
        this.estante = new ArrayList<>();
    }

    public void addDocumento (Documento d){
        this.estante.add(d);
    }

    public Iterator<Documento> getIterator(){
        return new IteratorDocumento();
    }

    public Iterator<Documento> iterator(){
        return new Iterator() {
            private int cant = estante.size();
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return cant != pos ;
            }

            @Override
            public Documento next() {
                Documento d= estante.get(pos);
                pos ++;
                return d;
            }

        };
    }

    private class IteratorDocumento implements Iterator<Documento>{
        private int cant = estante.size();
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return cant != pos ;
        }

        @Override
        public Documento next() {
            Documento d= estante.get(pos);
            pos ++;
            return d;
        }
    }

}
