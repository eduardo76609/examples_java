package practicacola;

public class Cola {
    
    Nodo cabeza;
    Nodo bottom;

    public Cola() {
        this.cabeza = null;
        this.bottom = null;
    }
    
    public boolean colaVacia(){
        if (cabeza == null) {
            return true;
        }
        return false;
    }
    
    public void encolar(int dato){
        insertar(dato);
    }
    
    public void insertar(int dato) {
        Nodo nodoAInsertar = new Nodo(dato);
        if (colaVacia()) {
            cabeza = nodoAInsertar;
            bottom = nodoAInsertar;
        } else {
            bottom.nodoSiguiente = nodoAInsertar;
            bottom = nodoAInsertar;
        }
    }
    
    public Nodo desencolar() {
        if (!colaVacia()) {
            Nodo nodoAExtraer = cabeza;
            if (cabeza == bottom) {
                cabeza = null;
                bottom = null;
            } else {
                cabeza = cabeza.nodoSiguiente;
            }
            return nodoAExtraer;
        } else {
            Nodo nodoAExtraer = new Nodo();
            nodoAExtraer.dato = 0;
            return nodoAExtraer;
        } 
    
    }
    
    public void imprimirCola() {
        Nodo datos = cabeza;
        while(datos != null) {
            System.out.println("Dato " + datos.dato);
            datos = datos.nodoSiguiente;
        }
    }    
    
}
