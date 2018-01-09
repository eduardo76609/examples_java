/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduardo76609
 */
public class OperationsTest {
    
    Operations operations = new Operations();
    
    public OperationsTest() {
    }

    @Test
    public void testFactorial() {
        
        int number = 2;
        int result = 4;
        String result_fact;
        
        result_fact = operations.factorial(number);
        assertEquals(result, result_fact);
    }
    
    @Test
    public void testSquareRoot() {
        
        int number = 36;
        String result = "6";
        String result_squa;
        
        result_squa = operations.squareRoot(number);
        assertEquals(result_squa, result);
    }
    
        @Test
    public void testHipotenuse() {
        
        int l_a = 3;
        int l_b = 4;
        int result = 5;
        int result_hipo;
        
        result_hipo = operations.hipotenuse(l_a, l_b);
        assertEquals(result, result_hipo);
    }
    
}