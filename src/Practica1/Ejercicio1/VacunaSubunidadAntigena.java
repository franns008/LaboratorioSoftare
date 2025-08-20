package Practica1.Ejercicio1;

public class VacunaSubunidadAntigena extends Vacuna {
    private int cantidadAntigenos;
    private String tipoProceso;

    public VacunaSubunidadAntigena(String marca, String paisOrigen, String enfermedadPreviene, int cantDosis, int cantidadAntigenos, String tipoProceso) {
        super(marca, paisOrigen, enfermedadPreviene, cantDosis);
        this.cantidadAntigenos = cantidadAntigenos;
        this.tipoProceso = tipoProceso;
    }

    public int getCantidadAntigenos() {
        return cantidadAntigenos;
    }

    public void setCantidadAntigenos(int cantidadAntigenos) {
        this.cantidadAntigenos = cantidadAntigenos;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }
}
