
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
public class ejercicio_36 {

    public static void main(String[] args) {

        int cod;
        double pc;
        int emfr = 0;
        int efr = 0;
        int er = 0;
        int enr = 0;
        double spc = 0;
        int nte;
        double pcg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del estudiante");

        cod = scanner.nextInt();

        do {
            System.out.println("Ingrese promedio credito:");
            pc = scanner.nextDouble();
            spc = spc + pc;

            if (pc >= 4.8) {
                emfr++;
                System.out.println(cod + " " + pc + " " + "Muy fuerte recomendación");
            } else if (pc >= 4.5) {
                efr++;
                System.out.println(cod + " " + pc + " " + "Fuerte recomendación");
            } else if (pc >= 4.0) {
                er++;
                System.out.println(cod + " " + pc + " " + "Recomendado");
            } else {
                enr++;
                System.out.println(cod + " " + pc + " " + "No recomendado");
            }

            System.out.println("Ingrese el código del estudiante");

            cod = scanner.nextInt();

        } while (cod != 0);

        nte = emfr + efr + er + enr;

        pcg = spc / nte;

        System.out.println(emfr);
        System.out.println(efr);
        System.out.println(er);
        System.out.println(enr);
        System.out.println(pcg);

    }

}