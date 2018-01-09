
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
public class ejercicio_30 {

    public static void main(String[] args) {

        double la;
        double an;
        int nsp = 0;
        int nsaf = 0;
        int sd1510 = 300;
        int sd2015 = 200;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las dimensiones de su sobre");

        // Leer dimensiones
        System.out.println("Ingrese el largo del sobre a pedir");
        la = scanner.nextDouble();

        while (la > 0) {
            System.out.println("Ingrese el ancho del sobre a pedir");
            an = scanner.nextDouble();
            nsp++;
            if (la <= 15 && an <= 10) {
                if (sd1510 > 0) {
                    sd1510--;
                } else if (sd2015 > 0) {
                    sd2015--;
                } else {
                    nsaf++;
                }
            } else if (la <= 20 && an <= 15) {
                if (sd2015 > 0) {
                    sd2015--;
                } else {
                    nsaf--;
                }
            } else {
                nsaf++;
            }
            System.out.println("Sobre registrado!!");
            System.out.println("Nuevas medidas para otro sobre");
            System.out.println("Ingrese el largo del sobre a pedir o 0 para terminar pedido");
            la = scanner.nextDouble();

        }
        System.out.println("Sobres pedidos: " + nsp + " sobres a fabricar: " + nsaf);
    }

}
