package Practica1.Ejercicio1;

public class Vacuna {
    private String marca;
    private String paisOrigen;
    private String enfermedadPreviene;
    private int cantDosis;

    public Vacuna(String marca, String paisOrigen, String enfermedadPreviene, int cantDosis) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.enfermedadPreviene = enfermedadPreviene;
        this.cantDosis = cantDosis;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEnfermedadPreviene() {
        return enfermedadPreviene;
    }

    public void setEnfermedadPreviene(String enfermedadPreviene) {
        this.enfermedadPreviene = enfermedadPreviene;
    }

    public int getCantDosis() {
        return cantDosis;
    }

    public void setCantDosis(int cantDosis) {
        this.cantDosis = cantDosis;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Vacuna{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", paisOrigen='").append(paisOrigen).append('\'');
        sb.append(", enfermedadPreviene='").append(enfermedadPreviene).append('\'');
        sb.append(", cantDosis=").append(cantDosis);
        sb.append('}');
        return sb.toString();
    }

}