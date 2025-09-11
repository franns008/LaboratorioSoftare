package Practica2.Ejercicio3;

import java.util.*;

public class HashSetAgregadosMia<E> implements Set<E> {
    private final Set<E> delegate;
    private int cantidadAgregados = 0;

    public HashSetAgregadosMia() {
        this.delegate = new HashSet<>();
    }

    public HashSetAgregadosMia(Set<E> base) {
        this.delegate = base;
    }

    @Override
    public boolean add(E e) {
        boolean agregado = delegate.add(e);
        if (agregado) cantidadAgregados++;
        return agregado;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean cambiado = false;
        for (E e : c) {
            cambiado |= add(e); // reutiliza add() para contar correctamente
        }
        return cambiado;
    }

    public int getCantidadAgregados() {
        return cantidadAgregados;
    }

    // Métodos delegados
    @Override public int size() { return delegate.size(); }
    @Override public boolean isEmpty() { return delegate.isEmpty(); }
    @Override public boolean contains(Object o) { return delegate.contains(o); }
    @Override public Iterator<E> iterator() { return delegate.iterator(); }
    @Override public Object[] toArray() { return delegate.toArray(); }
    @Override public <T> T[] toArray(T[] a) { return delegate.toArray(a); }
    @Override public boolean remove(Object o) { return delegate.remove(o); }
    @Override public boolean containsAll(Collection<?> c) { return delegate.containsAll(c); }
    @Override public boolean retainAll(Collection<?> c) { return delegate.retainAll(c); }
    @Override public boolean removeAll(Collection<?> c) { return delegate.removeAll(c); }
    @Override public void clear() { delegate.clear(); }
}
