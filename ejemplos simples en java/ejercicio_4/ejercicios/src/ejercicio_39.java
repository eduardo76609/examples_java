
import com.sun.org.apache.bcel.internal.generic.RETURN;
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
public class ejercicio_39 {

    public int[] orden(int pv, int sv, int tv, int menor, int medio, int mayor) {
        
        int[] array_return = new int[3];
        
        if ((pv < sv) && (pv < tv)) {
            menor = pv;
            if (sv < tv) {
                medio = sv;
                mayor = tv;
            } else {
                medio = tv;
                mayor = sv;
            }
        } else if (sv < tv) {
            menor = sv;
            if (pv < tv) {
                medio = pv;
                mayor = tv;
            }

        } else {
            menor = tv;
            if (pv < sv) {
                medio = pv;
                mayor = sv;
            } else {
                medio = sv;
                mayor = pv;
            }
        }
        
        array_return[0] = menor;
        array_return[1] = medio;
        array_return[2] = mayor;
        
        return array_return;
    }

}