package Practica2.Ejercicio3BienHecho;

import java.util.*;

public class HashSetRemovidos<E> extends AbstractSet<E> {
    private Set hash;
    private int cantRem;

    public HashSetRemovidos(){
        this.hash = new HashSet();
        cantRem = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return this.hash.iterator();
    }

    @Override
    public int size() {
        return this.hash.size();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        cantRem += c.size();
        return this.hash.removeAll(c);
    }

    @Override
    public boolean remove(Object o) {
        cantRem ++;
        return this.hash.remove(o);
    }
}
