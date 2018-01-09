/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo76609
 */
public class ejercicio_41 {

    public int mayor(int n1, int n2, int n3) {

        int val_may = 0;

        if ((n1 > n2) && (n1 > n3)) {
            val_may = n1;
        } else if (n2 > n3) {
            val_may = n2;
        } else {
            val_may = n3;
        }
        return val_may;
    }

}