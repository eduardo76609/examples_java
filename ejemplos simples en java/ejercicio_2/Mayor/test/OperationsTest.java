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
    public void testSumar() {
        int n1 = 10;
        int n2 = 2;
        int expResult = 12;
        int result;
        result = operations.sumar(n1, n2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRestar() {
        int n1 = 10;
        int n2 = 2;
        int expResult = 8;
        int result;
        result = operations.restar(n1, n2);
        assertEquals(expResult, result);
    }
    
}
