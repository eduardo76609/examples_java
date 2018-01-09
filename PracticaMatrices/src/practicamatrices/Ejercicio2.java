package practicamatrices;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        llenar_con_numeros(matriz);
        System.out.println(obtener_numero_mayor(matriz));
    }

    public static String obtener_numero_mayor(int matriz[][]) {
        int numero_mayor = 0, fila = 0, columna = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] > numero_mayor) {
                    numero_mayor = matriz[x][y];
                    fila = x;
                    columna = y;
                }

            }
        }
        return "El numero mayor de la matriz es: " + numero_mayor + " en la fila: " + fila + " y columna: " + columna;
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
