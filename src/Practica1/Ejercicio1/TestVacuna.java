package Practica1.Ejercicio1;

public class TestVacuna{
    public static void main(String[] args) {
        Vacuna[] vacunas = new Vacuna[5];
        for (int i = 0; i < 5; i++){
            vacunas[i] = new Vacuna("marca Generica"+i, "Argentina", "Fiebre", i);
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(vacunas[i].toString());
        }
        Vacuna vacuna1 = new Vacuna("marca1","argelia"," fiebre", 2);
        Vacuna vacuna2 = new Vacuna("marca1","argelia"," fiebre", 2);
        System.out.println(vacuna1.equals(vacuna2));
    }
}