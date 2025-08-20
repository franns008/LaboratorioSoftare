package Practica1.Ejercicio1;

public class VacunaPatogenoIntegro  extends Vacuna{
    private String nombrePatogeno;

    public VacunaPatogenoIntegro(String marca, String paisOrigen, String enfermedadPreviene, int cantDosis) {
        super(marca, paisOrigen, enfermedadPreviene, cantDosis);
    }

    public String getNombrePatogeno() {
        return nombrePatogeno;
    }

    public void setNombrePatogeno(String nombrePatogeno) {
        this.nombrePatogeno = nombrePatogeno;
    }
}
