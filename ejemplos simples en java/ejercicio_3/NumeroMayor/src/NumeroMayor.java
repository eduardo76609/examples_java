
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eduardo76609
 */
public class NumeroMayor {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado_entrada = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int y;
        int z;
        int max;

        System.out.println("Ingrese x,y,z:");

        x = Integer.parseInt(teclado_entrada.readLine());

        y = Integer.parseInt(teclado_entrada.readLine());

        z = Integer.parseInt(teclado_entrada.readLine());

        if (x > y && x > z) {
            max = x;
        } else {
            if (z > y) {
                max = z;
            } else {
                max = y;
            }
        }

        System.out.println("El número mayor es: " + max);
    }

}
