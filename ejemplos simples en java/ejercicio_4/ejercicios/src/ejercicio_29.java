
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
public class ejercicio_29 {

    public static void main(String[] args) {

        int pc, op, ntv;
        int nvpe = 0;
        int nvpa = 0;
        int nvvi = 0;
        int nvbl = 0;

        Scanner scanner = new Scanner(System.in);

        // Inicio        
        System.out.println("Introduzca número de piedracedula: ");
        pc = scanner.nextInt();
        while (pc > 0) {
            System.out.println("Ingrese su voto, pedro -> 1, pablo -> 2, vilma -> 3,  en blanco -> 0");
            op = scanner.nextInt();
            if (op == 1) {
                nvpe++;
            } else if (op == 2) {
                nvpa++;
            } else if (op == 3) {
                nvvi++;
            } else {
                nvbl++;
            }
            System.out.println("Gracias por votar!!");
            System.out.println("Ingrese otro numero de cedula o el numero 0 para salir y obtener los resultados");
            pc = scanner.nextInt();
        }
        
       ntv = nvpe + nvpa + nvvi + nvbl;
        System.out.println("Votos totales: " + ntv);
        System.out.println("repartidos asi: ");
        System.out.println("pablo: " + nvpa);
        System.out.println("pedro: " + nvpe);
        System.out.println("vilma: " + nvvi);
        System.out.println("en blanco: " + nvbl);
               
    }

}
