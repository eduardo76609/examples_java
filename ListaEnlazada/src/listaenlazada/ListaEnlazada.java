package listaenlazada;

public class ListaEnlazada {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        System.out.println("Insertando al inicio");
        lista.insertarAlInicio(12);
        lista.insertarAlInicio(15);
        lista.insertarAlInicio(9);
        
        System.out.println("Insertando al final");
        lista.insertarAlFinal(99);
        lista.insertarAlFinal(66);
        
        System.out.println("Borrando el dato 15");        
        lista.borrarDato(15);
        
        lista.imprimirLista();

//        Nodo primero = new Nodo(22);
//        Nodo segundo = new Nodo(33);
//        Nodo tercero = new Nodo(44);
//        
//        primero.setNodoSiguiente(segundo);
//        primero.getNodoSiguiente().setNodoSiguiente(tercero);
//        
//        System.out.println(segundo.getNodoSiguiente().getValor());
        
//        
//        System.out.println("Insertando al inicio");
//        lista.insertarAlInicio(41);
//        lista.insertarAlInicio(6);
//


    }

}
