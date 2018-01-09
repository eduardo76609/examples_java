
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
public class ejercicio_42 {

    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;

        int num_mayor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero 1");
        n1 = scanner.nextInt();

        System.out.println("Ingrese numero 2");
        n2 = scanner.nextInt();

        System.out.println("Ingrese numero 3");
        n3 = scanner.nextInt();

        ejercicio_41 ej_41 = new ejercicio_41();

        num_mayor = ej_41.mayor(n1, n2, n3);

        System.out.println("El valor mayor entre: " + n1 + ", " + n2 + ", " + n3 + " es: " + num_mayor);

    }

}