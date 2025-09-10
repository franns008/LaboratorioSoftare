package Practica3;

import java.lang.Math;

import static java.lang.Math.pow;

class InnerStatic {
    static double PI = 3.1416;

    static class Circulo {
        static double radio;

        static double getArea() {

            double a = PI * pow(radio, 2);
            System.out.println("El área es: " + a);
            return a;
        }

        static double getLongitudCircunferencia() {
            double l = 2 * PI * radio;
            System.out.println("La longitud es: " + l);
            return l;
        }

        static {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            radio = sc.nextDouble();
        }
    }

    public static void main(String[] args) {
        Circulo.getArea();
        Circulo.getLongitudCircunferencia();
    }
}
