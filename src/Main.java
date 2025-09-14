import Practica3.Ejercicio8.FrecuenciasDeLa;
import Practica3.Ejercicio8.Notas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("nota "+ Notas.DO.getCifradoAmericano()+ " frecuencia en HZ "+Notas.DO.getFrecuenciaHZ() );
        System.out.println("Frecuencias de LA "+ FrecuenciasDeLa.ISO16.name()+" "+FrecuenciasDeLa.ISO16.getFrecuenciaEnHZ());
    }
}
