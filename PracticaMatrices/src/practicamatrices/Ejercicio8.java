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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        llenar_con_numeros(matriz);
        System.out.println("Vector con resultado de sumas de filas y columnas: " + Arrays.toString(suma_filas_columnas(matriz)));
    }
    
    // aun no funciona
    public static int[] suma_filas_columnas(int matriz[][]){ 
        
        int position = -1;
        
        int suma_filas[];
        int suma_columnas[];
        
        suma_filas = new int[matriz.length];
        suma_columnas = new int[matriz.length];
        
        int vector_resultante[];
        vector_resultante = new int[48];
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                //position++;
                suma_filas[x] = suma_filas[x] + matriz[x][y];
                //vector_resultante[position] = suma_filas[x];
                
                //position++;
                suma_columnas[x] = suma_columnas[x] + matriz[y][x];
                //vector_resultante[position] = suma_columnas[x];
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