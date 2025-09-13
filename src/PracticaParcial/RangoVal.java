package PracticaParcial;

public enum RangoVal {
    HASTA2(0,2.0),
    DE2HASTA4(2.0,4.0),
    DE4HASTA7(4.0,7.0),
    DE7HASTA10(7.0,10.0);
    private double min;
    private double max;

    RangoVal(double min,double max){
        this.max = max;
        this.min = min;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
    public boolean enRango(double val){
        return val >= this.min && val < this.max;
    }
}
