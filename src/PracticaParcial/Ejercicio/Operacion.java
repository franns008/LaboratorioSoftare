package PracticaParcial.Ejercicio;

public enum Operacion {
    MAYUSCULA(){
        @Override
        public String aplicar(String s) {
            return s.toUpperCase();
        }
    },
    MINUSCULA(){
        public String aplicar(String s){
            return s.toLowerCase();
        }
    },
    CAPITALIZAR(){
        public String aplicar(String s){
            return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        }
    };



    public abstract String aplicar(String s);
}
