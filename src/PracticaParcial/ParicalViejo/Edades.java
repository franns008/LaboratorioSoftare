package PracticaParcial.ParicalViejo;

public enum Edades {
    APT("Apto para todo publico"),
    MAYORES13("Apto para mayores de 13 años"),
    MAYORES16("Apto para mayores de 16 años"),
    MAYORES18("Apto para mayores de 18 años")
    ;
    private String apto;
    Edades(String a){
        this.apto = a;
    }

    public String getApto() {
        return apto;
    }
    public boolean aptoParaEsaEdad(Edades e){
        return e==this;
    }
}
