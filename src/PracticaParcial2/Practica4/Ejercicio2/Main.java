package PracticaParcial2.Practica4.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //No se puede porque tiene que ser de la misma clase cuando
        // se pone algo a la izquierda y a la drecha. No son covariantes.
        Veterinaria <Animal> vet = new Veterinaria <Gato>();

        //peor, por lo mismo que arriba, tienen que ser del mismo tipo.
        Veterinaria <Gato> vet1 = new Veterinaria <Animal>();

        //La primer linea funciona bien, usas el comidin porque podes referenciar
        //cualquier tipo
        Veterinaria <?> vet2 = new Veterinaria<Gato>();
        //La segunda linea esta mal porque no se sabe que tipo esta usando
        //por lo tanto, no te va a dejar que le pases nada, a no ser que sea null
        vet2.setAnimal(new Gato());

        //funciona, pero peligroso, usa raw type. permite cualquier tipo
        // pero pierde el chequeo de tipos en compilacion
        Veterinaria vet3 = new Veterinaria ();
        vet3.setAnimal(new Perro());
        // no se puede crear una instancia comodin
        Veterinaria vet4 = new Veterinaria <?>();
        //Compila, no se puede hacer el setAnimal porque no se sabe que tipo exacto tiene el extends
        Veterinaria <? extends Animal> vet5 = new Veterinaria<Gato>();

    }
}
