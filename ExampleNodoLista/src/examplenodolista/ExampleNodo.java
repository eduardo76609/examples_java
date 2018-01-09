package examplenodolista;

public class ExampleNodo {

    private ExampleNodo liga;
    private int dato;

    public ExampleNodo(ExampleNodo liga, int dato) {
        this.liga = liga;
        this.dato = dato;
    }
    
    public ExampleNodo(){
        this.liga = null;
        this.dato = -1;
    }
    
    public ExampleNodo(int dato){
        this.liga = null;
        this.dato = dato;
    }
    
    public ExampleNodo getLiga() {
        return liga;
    }
    
    public void setLiga(ExampleNodo liga) {
        this.liga = liga;
    }
    
    public int getDato() {
        return dato;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    // buscar_donde_insertar
    
    // buscar_dato_borrar
    
}