package Practica3.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/*
ESTA CLASE EN SI NO  TIENE MUCHO SENTIDO, BASICAMENTE PORQUE SIEMPRE QUE LLAMES CON GET
INSTANCE AL ITERADOR TE VA A DEVOLVER LA MISMA INSTANCIA, EL PROBLEMA ES QUE NUNCA
SE ACTUALIZA LA MISMA, POR LO QUE RECORRERIAMOS SIEMPRE LO MISMO

ES SOLO A MODO DE PRACTICA.

 */
public class StackConIteratorSingleton {
    private ArrayList items;
    private Iterator instance;

    public StackConIteratorSingleton(){
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
        StackConIteratorSingleton s = new StackConIteratorSingleton();
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

    public Iterator getIteradorSingleton(){
        if (instance == null){
            this.instance = new StackIterator();
        }
        return instance;
    }

    private  class StackIterator implements Iterator{
        private int cant;

        private  StackIterator(){
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


