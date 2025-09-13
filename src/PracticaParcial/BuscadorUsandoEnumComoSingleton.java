package PracticaParcial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BuscadorUsandoEnumComoSingleton {

    private static final ComparadorPorPuntuacion comparadorPorPuntuacion = ComparadorPorPuntuacion.INSTANCE;
    private static final ComparadorPorVisualizacion comparadorPorVisualizacion = ComparadorPorVisualizacion.INSTANCE;
    private static final ComparadorPorAño comparadorPorAño = ComparadorPorAño.INSTANCE;
    private List<Pelicula> peliculas;

    public BuscadorUsandoEnumComoSingleton(){
        this.peliculas = new ArrayList<>();
    }

    public BuscadorUsandoEnumComoSingleton(List<Pelicula> peliculas){
        this.peliculas = peliculas;
    }

    public void addPelicula(Pelicula p){
        this.peliculas.add(p);
    }

    public List<Pelicula> seleccionar(Genero g, Edades e,RangoVal val,
                                      RangoRep repro,Comparator c){
        ArrayList<Pelicula> retornoLista = new ArrayList<>();
        for(Pelicula p : this.peliculas){
               if(val.enRango(p.getValoracion()) && repro.enRango(p.getCantRepr())
                       && e.aptoParaEsaEdad(p.getClasificacionEdad()) && p.getGeneros().contains(g)){
                   retornoLista.add(p);
               }
        }
        retornoLista.sort(c);
        return retornoLista;
    }

    //Seleccionar con Comparador Por Defecto:

    public List<Pelicula> seleccionar(Genero g, Edades e,RangoVal val,
                                      RangoRep repro){
        ArrayList<Pelicula> retornoLista = new ArrayList<>();
        for(Pelicula p : this.peliculas){
            if(val.enRango(p.getValoracion()) && repro.enRango(p.getCantRepr())
                    && e.aptoParaEsaEdad(p.getClasificacionEdad()) && p.getGeneros().contains(g)){
                retornoLista.add(p);
            }
        }
        retornoLista.sort(ComparadorPorAño.INSTANCE);
        return retornoLista;
    }
    private enum ComparadorPorVisualizacion implements Comparator<Pelicula>{
        INSTANCE;

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Integer.compare(o1.getCantRepr(),o2.getCantRepr());
        }

    }

    private enum ComparadorPorPuntuacion implements Comparator<Pelicula>{
        INSTANCE;
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o1.getValoracion(),o2.getValoracion());
        }


    }

    private enum ComparadorPorAño implements Comparator<Pelicula>{
        INSTANCE;
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getAño().compareTo(o2.getAño());
        }
    }


}
