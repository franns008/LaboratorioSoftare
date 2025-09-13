package Practica2.Ejercicio3BienHecho;

import java.util.*;

public class HashSetAgregadosMejorado<E> extends AbstractSet<E> {
    public HashSet set;
    public int cantAgregados;

    public HashSetAgregadosMejorado() {
        this.set = new HashSet();
        cantAgregados = 0;
    }

    @Override
    public boolean add(E e) {
        this.cantAgregados++;
        return this.set.add(e);
    }

    @Override
    public boolean addAll(Collection <? extends E> c){
        cantAgregados+=c.size();
        return this.set.addAll(c);
    }

    public int getCantidadAgregados(){
        return this.cantAgregados;
    }

    @Override
    public Iterator<E> iterator() {
        return this.set.iterator();
    }

    @Override
    public int size() {
        return this.set.size();
    }


}
