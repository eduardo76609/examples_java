package modificacionmetodosrecorrido;

public class Nodo {
    
    Cuenta dato;
    
    Nodo hijoIzquierdo;
    Nodo hijoDerecha;
    
    public Nodo(Cuenta nDato){
        dato = nDato;
        hijoIzquierdo = null;
        hijoDerecha = null;
    }
}
