package examplenodolista;

public class ExampleNodoLista {


    public static void main(String[] args) {
        
        ExampleLista miLista = new ExampleLista();
        
        miLista.insertFinal(8);
        miLista.insertFinal(7);
        miLista.insertFinal(4);
        miLista.insertFinal(10);
        
        miLista.imprimirLista();
    }
    
}
