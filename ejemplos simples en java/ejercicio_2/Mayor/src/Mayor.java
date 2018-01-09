
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo76609
 */
public class Mayor {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingrese un número: ");
        
        numero = teclado.nextInt();
        
        if(numero > 20){
            System.out.println("El número ingresado es mayor");
        }else{
            System.out.println("El número ingresado es menor");
        }
    
    }
    
}
