package PracticaParcial.ReHacerP3.ej2;

public class InnerStatic {
    static double PI = 3.1416;
    static class Circulo{
        static double radio;
        static double getArea(){
            double a = PI*Math.pow(radio,2);
            System.out.println("El area es de "+a);
            return a;
        }
        static  double getLongitudCircunsferencia(){
            double l = 2*PI*radio;
            System.out.println("la longitud es: "+l);
            return l;
        }
        static {
            System.out.println("Escribi el numero del radio");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            radio = sc.nextDouble();
        }
    }
}
