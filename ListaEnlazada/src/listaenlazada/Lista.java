package listaenlazada;

public class Lista {

    private Nodo nodoInicial;

    // constructor para inicializar la lista vacia
    public Lista() {
        this.nodoInicial = null;
    }

    public Nodo getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public void insertarAlInicio(int valor) {
        if (nodoInicial == null) {
            nodoInicial = new Nodo(valor);
        } else {
            Nodo nodoAuxiliar = nodoInicial;
            Nodo nuevoNodo = new Nodo(valor);
            nuevoNodo.setNodoSiguiente(nodoAuxiliar);
            nodoInicial = nuevoNodo;
        }

    }

    public void insertarAlFinal(int valor) {

        Nodo nuevoNodo = new Nodo(valor);
        Nodo auxiliarNodo;

        if (nodoInicial == null) {
            insertarAlInicio(valor);
        } else {
            auxiliarNodo = nodoInicial;
            while (auxiliarNodo.getNodoSiguiente() != null) {
                auxiliarNodo = auxiliarNodo.getNodoSiguiente();
            }
            auxiliarNodo.setNodoSiguiente(nuevoNodo);
        }
    }
    
    public void borrarDato(int valor){
        if (buscarDatoParaBorrar(valor)){
            if (nodoInicial.getValor() == valor){
                nodoInicial = nodoInicial.getNodoSiguiente();
            } else {
                Nodo nodoAuxiliar = nodoInicial;
                while(nodoAuxiliar.getNodoSiguiente().getValor() != valor){
                    nodoAuxiliar = nodoAuxiliar.getNodoSiguiente();
                }
                Nodo nodoConsecutivo = nodoAuxiliar.getNodoSiguiente().getNodoSiguiente();
                nodoAuxiliar.setNodoSiguiente(nodoConsecutivo);
            }
        }
    }

    public void imprimirLista() {
        Nodo nodoExistente = nodoInicial;
        while (nodoExistente != null) {
            System.out.println("valor del nodo: " + nodoExistente.getValor());
            nodoExistente = nodoExistente.getNodoSiguiente();
        }
    }
    
    public boolean buscarDatoParaBorrar(int valor){
        
        Nodo auxiliarNodo = nodoInicial;
        boolean resultado = false;
        
        while (auxiliarNodo != null && resultado != true){
            if (auxiliarNodo.getValor() == valor){
                resultado = true;
            } else {
                auxiliarNodo = auxiliarNodo.getNodoSiguiente();
            }
        }
        return resultado;
    }

}
