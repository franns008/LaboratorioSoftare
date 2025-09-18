package PracticaParcial.ParicalViejo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BuscadorConOtroSingleton {

    private static final ComparadorPorPuntuacion comparadorDePelicula = new ComparadorPorPuntuacion();
    private static final ComparadorPorVisualizacion comparadorPorVisualizacion = new ComparadorPorVisualizacion();
    private static final ComparadorPorAño comparadorPorAño = new ComparadorPorAño();
    private List<Pelicula> peliculas;

    public BuscadorConOtroSingleton(){
        this.peliculas = new ArrayList<>();
    }

    public BuscadorConOtroSingleton(List<Pelicula> peliculas){
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
        retornoLista.sort(comparadorPorVisualizacion);
        return retornoLista;
    }
    private static class ComparadorPorVisualizacion implements Comparator<Pelicula>{
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Integer.compare(o1.getCantRepr(),o2.getCantRepr());
        }

    }

    private static  class ComparadorPorPuntuacion implements Comparator<Pelicula>{

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o1.getValoracion(),o2.getValoracion());
        }


    }

    private static class ComparadorPorAño implements Comparator<Pelicula>{

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getAño().compareTo(o2.getAño());
        }
    }


}
