package PracticaParcial.EjerciciosExtra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringCollection {
    private List<Object> l;

    public StringCollection(){
        l = new ArrayList<>();
    }

    public void add(Object o){
        this.l.add(o);
    }

    public Iterator<String> getStringIterator(){
        return new StringIteratorAdapter();
    }

    private class StringIteratorAdapter implements Iterator{
        private int cant = l.size();
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return cant != pos;
        }

        @Override
        public Object next() {
            String s = l.get(pos).toString();
            pos ++;
            return s;
        }
    }

}
