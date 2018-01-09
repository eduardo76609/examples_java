
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eduardo76609
 */
public class ejercicio_35 {

    public static void main(String[] args) {

        int suma = 0;
        int num = 1;
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        n = scanner.nextInt();

        do {
            suma = suma + num;
            num++;
        } while (num <= n);

        System.out.println("La suma es: " + suma);

    }

}
