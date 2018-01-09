package practicamatrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        llenar_con_numeros(matriz);
        System.out.println("Los resultados de las sumas de las filas es: " + Arrays.toString(suma_filas(matriz)));
        System.out.println("Los resultados de las sumas de las columnas es: " + Arrays.toString(suma_columnas(matriz)));
    }
    
    public static int[] suma_filas(int matriz[][]){    
        int suma_filas[];
        suma_filas = new int[matriz.length];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                suma_filas[x] = suma_filas[x] + matriz[x][y]; 
            }
        }
        return suma_filas;
    }
    
    public static int[] suma_columnas(int matriz[][]){
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