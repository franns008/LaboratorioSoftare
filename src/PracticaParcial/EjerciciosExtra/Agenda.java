package PracticaParcial.EjerciciosExtra;

import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<Persona> l;

    public Agenda(){
        this.l = new ArrayList<>();
    }

    public Buscar buscar(String n){
        class ResultadoBusqueda implements Buscar{
            private int posicion =-1;
            private String nombre = "none";

            public ResultadoBusqueda() {
                int pos;
                for (int i = 0; i < l.size(); i++) {
                    if(l.get(i).getNombre().equals(n)){
                        posicion =i;
                        nombre = l.get(i).getNombre();
                    }

                }
            }

            public int getPosicion() {
                return posicion;
            }

            public String getNombre() {
                return nombre;
            }
        }
        return new ResultadoBusqueda();
    }


}
