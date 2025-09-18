package PracticaParcial.ParicalViejo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Buscador {

    private Comparator comparadorDePelicula;
    private List<Pelicula> peliculas;

    public Buscador(){
        this.peliculas = new ArrayList<>();
        this.comparadorDePelicula = ComparadorPorVisualizacion.getInstance();
    }

    public Buscador(List<Pelicula> peliculas){
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

    private static class ComparadorPorVisualizacion implements Comparator<Pelicula>{
        private static final Comparator<Pelicula> a = new ComparadorPorVisualizacion();

        private ComparadorPorVisualizacion(){

        }

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Integer.compare(o1.getCantRepr(),o2.getCantRepr());
        }

        public static Comparator getInstance(){
            return a;
        }
    }

    private static class ComparadorPorPuntuacion implements Comparator<Pelicula>{
        private static final Comparator<Pelicula> a = new ComparadorPorPuntuacion();

        private ComparadorPorPuntuacion(){

        }

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o1.getValoracion(),o2.getValoracion());
        }

        public static Comparator getInstance(){
            return a;
        }
    }


}
