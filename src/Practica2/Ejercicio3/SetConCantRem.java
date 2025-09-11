package Practica2.Ejercicio3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SetConCantRem<E> extends Decorator<E> {
    private int cantRem;

    public SetConCantRem(Set<E> s) {
        super(s);
        cantRem = 0;
    }

    @Override
    public boolean remove(Object o) {
        if (super.remove(o)) {
            cantRem++;
            return true;
        }
        return false;
    }

    public int getCantRem() {
        return cantRem;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean cambio = false;
        for (Object e : c) {
            if (super.remove(e)) {
                cantRem++;
                cambio = true;
            }
        }
        return cambio;
    }
}

