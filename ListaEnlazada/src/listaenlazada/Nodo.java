package listaenlazada;

public class Nodo {

    private int valor;
    private Nodo nodoSiguiente;

    // constructor para inicializar variables
    public Nodo() {
        this.valor = 0;
        this.nodoSiguiente = null;
    }

    // constructor para inicializar el siguiente nodo
    public Nodo(int valor, Nodo nodoSiguiente) {
        this.valor = valor;
        this.nodoSiguiente = nodoSiguiente;
    }

    // constructor para agregar al fin al
    public Nodo(int valor) {
        this.valor = valor;
        this.nodoSiguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

}
