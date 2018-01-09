/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatrices;

/**
 *
 * @author Eduardo76609
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        llenar_con_numeros(matriz);
    }

    public static void llenar_con_numeros(int matriz[][]) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (x == y) {
                    System.out.println("[" + x + "," + y + "]" + "hace parte de la diagonal, se pondra valor 1 por defecto");
                    matriz[x][y] = 1;
                } else {
                    System.out.println("[" + x + "," + y + "]" + "hace parte de la diagonal, se pondra valor 0 por defecto");
                    matriz[x][y] = 0;
                }
            }
        }
    }

}
