package practicacola;

public class PracticaCola {

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar(3);
        cola.encolar(6);
        cola.encolar(9);
        cola.imprimirCola();
        System.out.println("Datos antes de extraer");
        System.out.println("Extrayendo la cabeza " + cola.desencolar().dato);
        System.out.println("Datos despues de extraer la cabeza");
        cola.imprimirCola();
    }

}
