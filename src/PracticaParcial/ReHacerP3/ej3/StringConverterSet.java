package PracticaParcial.ReHacerP3.ej3;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringConverterSet extends AbstractSet {
    private Set s;

    public StringConverterSet(){
        this.s = new HashSet();
    }

    @Override
    public Iterator<String> iterator() {
        return  new IteratorStringAdapter();
    }

    @Override
    public int size() {
        return s.size();
    }
    private class IteratorStringAdapter implements Iterator<String>{

        private Iterator instance = s.iterator();
        @Override
        public boolean hasNext() {
            return instance.hasNext();
        }

        @Override
        public String next() {
            return instance.next().toString();
        }
    }
}
