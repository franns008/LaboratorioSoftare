package PracticaParcial.EjerciciosExtra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T> {
    private List<T> l;

    public Stack() {
        this.l = new ArrayList<>();
    }

    public void push(T t){
        this.l.add(t);
    }

    public Object pop(){
        Object o = this.l.get(this.l.size()-1);
        this.l.remove(o);
        return o;
    }

    public Object peek(){
        return  this.l.get(this.l.size() -1);
    }

    public Iterator getIterator(){
        return new StackIterator();
    }

    private class StackIterator implements Iterator{
        private int cant = l.size();


        @Override
        public boolean hasNext() {
            return cant !=0;
        }

        @Override
        public T next() {
            T o = l.get(cant-1);
            cant --;
            return o;
        }
    }


}
