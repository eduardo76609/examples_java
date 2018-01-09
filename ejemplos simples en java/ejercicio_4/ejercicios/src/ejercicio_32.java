
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
public class ejercicio_32 {

    public static void main(String[] args) {
        
        int iden;
        int peso;
        int con = 0;
        double T;
        double R = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su identificación: ");
        iden = scanner.nextInt();

        while (iden > 0) {
            
            System.out.println("Ingrese su peso: ");
            peso = scanner.nextInt();

            System.out.println("Ingrese su condición: ");
            con = scanner.nextInt();
            con = con - 2;

            switch (con) {
                case 1:
                    R = 0.15;
                    break;

                case 2:
                    R = 0.21;
                    break;

                case 3:
                    R = 0.22;
                    break;

                case 4:
                    R = 0.26;
                    break;
            }

            T = peso * R;

            System.out.println("Su identificación es: " + iden + ", y tiempo: " + T);

            System.out.println("Ingrese su identificación: ");
            iden = scanner.nextInt();
        }

    }

}
