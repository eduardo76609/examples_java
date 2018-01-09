package arbolesavl;

public class Nodo {

    int clave;
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;
    int FB;

    public Nodo(int dato) {
        this.clave = dato;
        hijoIzquierdo = null;
        hijoDerecho = null;
        FB = 0;
    }

}
