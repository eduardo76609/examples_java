package practicamatrices;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][6];
        llenar_con_numeros(matriz);
        System.out.println("La suma de los numeros de la matriz es: " + sumar_numeros_matriz(matriz));
    }

    public static int sumar_numeros_matriz(int matriz[][]) {
        int suma_numeros = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                suma_numeros = suma_numeros + matriz[x][y];
            }
        }
        return suma_numeros;
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
