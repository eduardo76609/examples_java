package practicapila;

public class PracticaPila {

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar(3);
        pila.apilar(6);
        pila.apilar(9);
        pila.imprimirPila();
        System.out.println("Datos antes de desapilar");
        System.out.println("Extrayendo el top " + pila.desapilar().dato);
        System.out.println("Datos despues de extraer el top");
        pila.imprimirPila();
    }

}
