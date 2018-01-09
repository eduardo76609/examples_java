/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodolista;

/**
 *
 * @author 312A-34
 */
public class Lista {
    
    NodoLista L;
    
    public void insert(int n){}
    
    public void recorrer(){}
    
    public void borrar(){}

    protected int buscar_donde_insertar(NodoLista L, int d){
    
        nodoLista p = L;
        nodoLista y = null;
        
        while((p.getLiga() != null) && (p.getDato() < d)){
            
            y = p;
            p = L.getLiga();
        
        }
        
        return p;
    
    }
    
    public void recorrer(nodoLista L){
    
        nodoLista p = L;
        
        while(p != null){
            
            System.out.println(p.getDato());
            p = p.
        }
    
    }
    
    
}
