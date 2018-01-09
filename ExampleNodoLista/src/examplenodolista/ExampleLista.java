package examplenodolista;

public class ExampleLista {
    
    private ExampleNodo nodoInicial;
    private int tamano;
    
    public ExampleLista(){
        nodoInicial = null;
        tamano = 0;
    }
    
    public void imprimirLista(){
        ExampleNodo p = nodoInicial;
        while(p != null){
            System.out.println(p.getDato());
            p.getLiga();
        }
    }

    public ExampleNodo getNodoInicial(){
        return nodoInicial;
    }    
    
    public void setNodoInicial(ExampleNodo L){
        this.nodoInicial = L;
    }

    public void insertOrdenado(int d){}  
    
    public void insertFinal(int d){
        
        ExampleNodo nuevoNodo = new ExampleNodo(d);
        
        if (nodoInicial == null){
            nodoInicial = nuevoNodo;
            tamano = 1;
        } else {
            ExampleNodo p = nodoInicial;
            while(p.getLiga() != null){
                p = p.getLiga();
            }
            p.setLiga(nuevoNodo);
        }
        
    }    
      
    
}
