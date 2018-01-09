package arbolesbasicosnuevosmetodos;

public class ArbolesBasicosNuevosMetodos {

    public static void main(String[] args) {

        ArbolBinario miarbol = new ArbolBinario();

        //Se crea una cuenta que va a ser insertada en el árbol
        Estudiante cuenta1 = new Estudiante(20, "Eduard", 5214932);
        miarbol.insertar(cuenta1);

        Estudiante cuenta2 = new Estudiante(10, "Camilo", 2367656);
        miarbol.insertar(cuenta2);

        Estudiante cuenta3 = new Estudiante(30, "Daniel", 2323234);
        miarbol.insertar(cuenta3);

        Nodo mipadre;

        mipadre = miarbol.buscar_padre(20);
        if (mipadre == null) {
            System.out.println("Dato no hallado o es la raiz del arbol");
        } else {
            System.out.println(mipadre.dato.getCedula());
        }

        mipadre = miarbol.buscar_padre(10);
        if (mipadre == null) {
            System.out.println("Dato no hallado o es la raiz del arbol");
        } else {
            System.out.println(mipadre.dato.getCedula());
        }

        mipadre = miarbol.buscar_padre(30);
        if (mipadre == null) {
            System.out.println("Dato no hallado o es la raiz del arbol");
        } else {
            System.out.println(mipadre.dato.getCedula());
        }
        
        Nodo buscado;
        
        buscado = miarbol.find_key(10);
        if (buscado == null) {
            System.out.println("El dato no esta en el arbol");
        } else {
            System.out.println("El nombre de la cuenta es: " + buscado.dato.getNombre());
        }
        
        buscado = miarbol.find_key(20);
        if (buscado == null) {
            System.out.println("El dato no esta en el arbol");
        } else {
            System.out.println("El nombre de la cuenta es: " + buscado.dato.getNombre());
        }
        
        buscado = miarbol.find_key(30);
        if (buscado == null) {
            System.out.println("El dato no esta en el arbol");
        } else {
            System.out.println("El nombre de la cuenta es: " + buscado.dato.getNombre());
        }

    }

}
