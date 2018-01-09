/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrectangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo76609
 */
public class MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroRectangulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de rectangulos"));

        Rectangulo retangulos[] = new Rectangulo[numeroRectangulos];

        for(int i = 0; i < retangulos.length; i++){
            float Base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del rectangulo número " + (i + 1)));
            float Altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del rectangulo número " + (i+ 1)));        
            retangulos[i] = new Rectangulo(Base, Altura);
        }

        for(int i = 0; i < retangulos.length; i++){
            System.out.println("Rectangulo " + (i + 1) 
                    + " b: " + retangulos[i].getBase() 
                    + " h: " + retangulos[i].getAltura() 
                    + " area: " + retangulos[i].getArea() 
                    + " perimetro: " + retangulos[i].getPerimetro()); 
        }
       
    }
    
}
