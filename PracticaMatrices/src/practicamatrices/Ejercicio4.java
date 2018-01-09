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
public class Ejercicio4 {

    public static void main(String[] args) {
        int matriz[][] = new int[20][20];
        int[] suma;
        llenar_con_numeros(matriz);
        suma = suma_columnas(matriz);
        columna_con_maxima_suma(suma);
    }

    public static void columna_con_maxima_suma(int[] suma) {
        int max = 0, columna = 0;
        for (int i = 0; i < suma.length; i++) {
            if (suma[i] > max) {
                max = suma[i];
                columna = i;
            }
        }
        System.out.println("Columna: " + columna);
        System.out.println("Suma mayor: " + max);
    }

    public static int[] suma_columnas(int matriz[][]) {
        int suma_columnas[];
        suma_columnas = new int[matriz.length];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                suma_columnas[x] = suma_columnas[x] + matriz[y][x];
            }
        }
        return suma_columnas;
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
