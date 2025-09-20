package PracticaParcial.EjerciciosExtra.SistemaDeUsuarios;

public class Usuario {
    private String userName;
    private  Rol rol;
    public Usuario(String userName, Rol r) {
        this.userName = userName;
        this.rol = r;
    }

    public String getUserName() {
        return userName;
    }

    public String getRol(){
        return rol.getName();
    }
}
