package arbolesbasicosnuevosmetodos;

public class Nodo {

    Estudiante dato;

    Nodo hijoIzquierdo;
    Nodo hijoDerecho;

    public Nodo(Estudiante dato) {
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

}
