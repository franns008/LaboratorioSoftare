package Practica3.Ejercicio8;

import java.util.Iterator;
import java.util.List;

public enum Musico {
    FITOPAEZ(new Piano());

    private InstrumentoMusical i;

    Musico(InstrumentoMusical i){
        this.i = i;
    }

    public void tocarCancion(List<Notas> n, List<Integer> d){
        Iterator <Notas> i = n.iterator();
        Iterator <Integer> i2 = d.iterator();
        while (i.hasNext()){
            this.i.hacerSonar(i.next(),i2.next());
        }
    }

}
