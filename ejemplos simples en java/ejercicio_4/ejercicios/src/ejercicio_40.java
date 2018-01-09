
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
public class ejercicio_40 {

    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;
        
        int[] array;

        int men = 0;
        int med = 0;
        int may = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero 1");
        n1 = scanner.nextInt();

        System.out.println("Ingrese numero 2");
        n2 = scanner.nextInt();

        System.out.println("Ingrese numero 3");
        n3 = scanner.nextInt();
        
        ejercicio_39 ej = new ejercicio_39();

        array = ej.orden(n1, n2, n3, men, med, may);

        System.out.println("Valor menor: " + array[0]);
        System.out.println("Valor medio: " + array[1]);
        System.out.println("Valor mayor: " + array[2]);
    }

}