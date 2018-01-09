
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
public class ejercicio_31 {

    public static void main(String[] args) {

        String nom = "";
        double salm;
        int cat;
        int nup;
        double tdev;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");

        nom = scanner.nextLine();
       
        while (!nom.equalsIgnoreCase("x")) {
            
            // System.out.println("Ingrese OTRAVEZ su nombre: ");
            // nom = scanner.nextLine();
            
            System.out.println("Ingrese su salario");
            salm = scanner.nextInt();
            tdev = salm;

            System.out.println("Ingrese su categoria");
            cat = scanner.nextInt();

            System.out.println("Ingrese su numero de unidades producidas");
            nup = scanner.nextInt();

            switch (cat) {

                case 1:
                    if (nup > 50) {
                        tdev = tdev + (0.05 * salm);
                    }
                    break;

                case 2:
                    if (nup > 50) {
                        tdev = tdev + (0.07 * salm);
                    }
                    break;

                case 3:
                    if (nup > 50) {
                        tdev = tdev + (0.1 * salm);
                    }
                    break;

                case 4:
                    if (nup > 50) {
                        tdev = tdev + (0.15 * salm);
                    }
                    break;

                default:
                    tdev = tdev;
                    break;
            }

            System.out.println(nom + " devengo: $" + tdev);

            System.out.println("Ingrese otro nombre o la x para salir");
            scanner.nextLine();
            nom = scanner.nextLine(); 
            
        }
        

    }

}
