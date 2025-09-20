package PracticaParcial.EjerciciosExtra.SistemaDeUsuarios;

public enum Rol {
    ADMIN("Admin"),
    EDITOR("Editor"),
    LECTOR("Lector");

    private String name;

    Rol(String s){
        this.name = s;
    }

    public String getName() {
        return name;
    }
}
