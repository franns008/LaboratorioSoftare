package Practica3;

import java.util.*;

public class StringConverterSet extends AbstractSet {
    private Set<String> s;

    public StringConverterSet(Set s){
        this.s =s;
    }
    @Override
    public Iterator iterator() {
        return new IteratorStringAdapter();
    }

    @Override
    public int size() {
        return s.size();
    }

    private class IteratorStringAdapter implements Iterator{

        private Iterator i;

        private IteratorStringAdapter(){
            i = s.iterator();
        }

        @Override
        public boolean hasNext() {
            return i.hasNext();
        }
        @Override
        public String next() {
           return i.next().toString();
        }
    }
}
