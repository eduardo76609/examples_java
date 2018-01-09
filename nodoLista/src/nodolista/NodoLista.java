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
public class NodoLista {
    
    private NodoLista liga;
    private int posicion;
    private int dato;

    public NodoLista(NodoLista liga, int posicion, int dato) {
        this.liga = liga;
        this.posicion = posicion;
        this.dato = dato;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     * @return the liga
     */
    public NodoLista getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(NodoLista liga) {
        this.liga = liga;
    }

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    
}
