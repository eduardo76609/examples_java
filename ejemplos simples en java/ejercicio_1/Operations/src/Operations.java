/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo76609
 */
public class Operations {
    
    public String factorial(int number){
        String factorial = "";
        if (number == 0){
            factorial = "1";
        } else {
            int numero = 1;
            for (int i = 1; i <= number; i++){
                numero *= i;
            }
            factorial = Integer.toString(numero);
        }
        return factorial;
    }
    
    public String squareRoot(int number){
        String mensaje;
        if (number < 0 || number == 0){
            mensaje = "No se admiten numeros negativos ni ceros, introduzca otro";
        }else{
            mensaje = Integer.toString((int) Math.sqrt(number));
        }    
    return mensaje;
    }
           
    public int hipotenuse(int l_a, int l_b){
        int hipo;
        hipo = (int) Math.sqrt(Math.pow(l_a, 2) + Math.pow(l_b, 2));
        return hipo;
    }
    
}
