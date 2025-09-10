package Practica3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack {
    private ArrayList items;


    public Stack(){
        this.items = new ArrayList();
    }

    public void push (Object item){
        this.items.add(item);
    }

    public Object pop(){
        Object o =this.items.get(this.items.size()-1);
        this.items.remove(o);
        return o;
    }

    public boolean isEmpty(){
        return this.items.size() ==0;
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("item "+s.pop());
        System.out.println("vacio? "+s.isEmpty());
        s.pop();
        s.pop();
        System.out.println("vacio? "+s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        Iterator it = s.getIterator();
        while(it.hasNext()){
            System.out.println("Elemento "+it.next());
        }
    }

    public Iterator getIterator(){
        return new StackIterator();
    }

    private class StackIterator implements Iterator{
        private int cant;
        public StackIterator(){
            this.cant = items.size();
        }


        @Override
        public boolean hasNext() {
            return cant != 0;
        }

        @Override
        public Object next() {
            Object o = items.get(cant-1);
            cant--;
            return o;
        }
    }
}


