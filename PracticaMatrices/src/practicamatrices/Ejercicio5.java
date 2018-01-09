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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        llenar_con_numeros(matriz);
        System.out.println("La diagonal principal es: " + Arrays.toString(sacar_diagonal(matriz)));

    }
    
    public static int[] sacar_diagonal(int matriz[][]){
        int diagonal_resultante[];
        diagonal_resultante = new int[matriz.length];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (x == y) {
                    diagonal_resultante[x] = matriz[x][y];
                }
            }
        }
        return diagonal_resultante;
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
