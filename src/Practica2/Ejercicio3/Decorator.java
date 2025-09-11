package Practica2.Ejercicio3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class Decorator<E> implements Set<E> {
    protected Set<E> concreteComponent;

    public Decorator(Set<E> s){
        this.concreteComponent=s;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return this.concreteComponent.addAll(c);
    }

    @Override
    public boolean add(E e) {
        return this.concreteComponent.add(e);
    }

    @Override public int size() { return concreteComponent.size(); }
    @Override public boolean isEmpty() { return concreteComponent.isEmpty(); }
    @Override public boolean contains(Object o) { return concreteComponent.contains(o); }
    @Override public Iterator<E> iterator() { return concreteComponent.iterator(); }
    @Override public Object[] toArray() { return concreteComponent.toArray(); }
    @Override public <T> T[] toArray(T[] a) { return concreteComponent.toArray(a); }
    @Override public boolean remove(Object o) { return concreteComponent.remove(o); }
    @Override public boolean containsAll(Collection<?> c) { return concreteComponent.containsAll(c); }
    @Override public boolean retainAll(Collection<?> c) { return concreteComponent.retainAll(c); }
    @Override public boolean removeAll(Collection<?> c) { return concreteComponent.removeAll(c); }
    @Override public void clear() { concreteComponent.clear(); }



}
