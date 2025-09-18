package PracticaParcial.ParicalViejo;

public enum RangoRep {
    MENOS10(0,10),
    DE10A99(10,99),
    DE100A499(100,499),
    DE500A1000(500,1000),
    MAS1000(1000,Integer.MAX_VALUE);
    private int min;
    private int max;

    RangoRep(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public boolean enRango(int val){
        if(this.min>=val && this.max<=val){
            return true;
        }
        return false;
    }
}
