package Practica3.Ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Piano implements InstrumentoMusical { ;
    private double frecuencia;
    private Notas nota;
    private int duracion;

    @Override
    public void hacerSonar() {
        if(nota == null){
            System.out.println("No hay nadie para tocarlo");
        }else{
            System.out.println("Estoy tocando "+nota.getCifradoAmericano()+" a una frecuencia "+frecuencia+ "con una duracion "+duracion);
        }
   }

    @Override
    public void hacerSonar(Notas n, int duracion) {
        nota = n;
        frecuencia = n.getFrecuenciaHZ();
        this.duracion = duracion;
        this.hacerSonar();
    }

    @Override
    public String queEs() {
        return "Piano";
    }

    @Override
    public void afinar(FrecuenciasDeLa f) {
        if (Notas.FA == nota){
            frecuencia = f.getFrecuenciaEnHZ();
        }
    }

    public static void main(String[] args) {
        Piano p = new Piano();
        p.hacerSonar(Notas.DO,5);
        p.hacerSonar(Notas.LA,5);
        p.hacerSonar(Notas.RE,3);
        p.hacerSonar(Notas.LA,4);
        p.hacerSonar(Notas.FA,3);
        p.afinar(FrecuenciasDeLa.AFINACIONCAMARA);
        p.hacerSonar();
        System.out.println();
        System.out.println("============  Ahora toca el pelotudo de fito ============");
        System.out.println();
        List<Notas> listaNotas = new ArrayList<>();
        List<Integer> listaInteger = new ArrayList<>();
        listaNotas.add(Notas.RE);
        listaInteger.add(2);
        listaNotas.add(Notas.DO);
        listaInteger.add(4);
        listaNotas.add(Notas.MI);
        listaInteger.add(8);
        listaNotas.add(Notas.RE);
        listaInteger.add(2);
        listaNotas.add(Notas.FA);
        listaInteger.add(2);
        listaNotas.add(Notas.SI);
        listaInteger.add(4);
        Musico.FITOPAEZ.tocarCancion(listaNotas,listaInteger);



    }
}
