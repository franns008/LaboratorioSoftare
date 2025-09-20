package PracticaParcial.EjerciciosExtra.SistemaDeUsuarios;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GestorUsuarios g = new GestorUsuarios();
        Usuario u = new Usuario("f",Rol.EDITOR);
        Usuario u2 = new Usuario("s",Rol.ADMIN);
        Usuario u3 = new Usuario ("p",Rol.LECTOR);
        g.addUsuario(u);
        g.addUsuario(u2);
        g.addUsuario(u3);
        Iterator<Usuario> i = g.getIterator();
        while(i.hasNext()){
            Usuario u1 = i.next();
            System.out.println(u1.getUserName()+" "+u1.getRol());
        }
    }
}
