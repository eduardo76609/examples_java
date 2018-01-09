/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Eduardo76609
 */
public class Ejercicio7 { 
    
    public static void main(String[] args) {
        int matriz[][] = new int[6][8];
        llenar_con_numeros(matriz);
        System.out.println("Vector resultante de toda la matriz: " + Arrays.toString(vector_resultante(matriz)));
    }
    
    public static int[] vector_resultante(int matriz[][]){
        int position = -1;
        int vector_resultante[];
        vector_resultante = new int[48];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                position++;
                vector_resultante[position] = matriz[x][y]; 
            }
        }
        return vector_resultante;
    }
    
    public static void llenar_con_numeros(int matriz[][]) {
        Scanner teclado = new Scanner(System.in);
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                matriz[x][y] = teclado.nextInt();
            }
        }
    }
    
}