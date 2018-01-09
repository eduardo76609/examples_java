package practicapila;

public class Pila {

    Nodo top;

    public Pila() {
        this.top = null;
    }

    public void apilar(int dato) {
        Nodo nodoParaApilar = new Nodo(dato);
        if (top == null) {
            nodoParaApilar.nodoSiguiente = null;
            top = nodoParaApilar;
        } else {
            nodoParaApilar.nodoSiguiente = top;
            top = nodoParaApilar;
        }
    }

    public Nodo desapilar() {
        if (top != null) {
            Nodo nodoDesapilar = top;
            top = top.nodoSiguiente;
            return nodoDesapilar;
        } else {
            Nodo nodoDesapilar = new Nodo();
            nodoDesapilar.dato = 0;
            return nodoDesapilar;
        }
    }

    public void imprimirPila() {
        Nodo datos = top;
        while (datos != null) {
            System.out.println("Dato " + datos.dato);
            datos = datos.nodoSiguiente;
        }

    }

}
