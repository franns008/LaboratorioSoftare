package PracticaParcial.EjerciciosExtra.SistemaDeUsuarios;

import java.util.*;

public class GestorUsuarios {
    private List<Usuario> listaUsuarios;

    public GestorUsuarios(){
        this.listaUsuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario u){
        this.listaUsuarios.add(u);
    }

    public Iterator<Usuario> getIterator(){
        return new UsuarioIterator();
    }

    private class UsuarioIterator implements Iterator<Usuario>{
        private int cant = listaUsuarios.size();
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return  pos < cant;
        }

        @Override
        public Usuario next() {
            Usuario u = listaUsuarios.get(pos);
            pos++;
            return u;
        }
    }
}
