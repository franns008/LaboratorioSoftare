package PracticaParcial.EjercicioIntegrador.RedSocial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GestorUsuarios {
    private List<Usuario> listaU;


    public GestorUsuarios(){
        this.listaU = new ArrayList<>();
    }

    public void addUsuario(Usuario u){
        this.listaU.add(u);
    }

    public Iterator<Usuario> getIterator(){
        return new IteradorUsuario();
    }

    public Comparator<Usuario> getComparator(){
        return new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };
    }

    public List<Usuario> getUsuariosOrdenados(){
        List<Usuario> copia = new ArrayList<>(listaU);
        copia.sort(this.getComparator());
        return copia;
    }

    private class IteradorUsuario implements Iterator<Usuario>{
        private int cant = listaU.size();
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos<cant;
        }

        @Override
        public Usuario next() {
            Usuario u = listaU.get(pos);
            pos ++;
            return  u;
        }
    }

}
