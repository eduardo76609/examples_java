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
 * @author Eduardo76609
 */
public class MatrixTest {

    public MatrixTest() {
    }

//    @Test
//    public void testRandom() {
//        System.out.println("random");
//        int m = 0;
//        int n = 0;
//        double[][] expResult = null;
//        double[][] result = Matrix.random(m, n);
//        assertArrayEquals(expResult, result);
//        
//    }
    @Test
    public void testIdentity() {
        System.out.println("identity");
        int n = 2;
        double[][] expResult = {{1, 0}, {0, 1}};
        double[][] result = Matrix.identity(n);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of dot method, of class Matrix.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        double[] x = {3, 7};
        double[] y = {6, 3};
        double expResult = 39;
        double result = Matrix.dot(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of transpose method, of class Matrix.
     */
    @Test
    public void testTranspose() {
        System.out.println("transpose");
        double[][] a = {{1, 2}, {3, 4}, {5, 6}};
        double[][] expResult = {{1, 3, 5}, {2, 4, 6}};
        double[][] result = Matrix.transpose(a);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of add method, of class Matrix.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double[][] a = {{1, 1}, {1, 1}};
        double[][] b = {{2, 2}, {2, 2}};
        double[][] expResult = {{3, 3}, {3, 3}};
        double[][] result = Matrix.add(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Matrix.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double[][] a = {{10, 10}, {10, 10}};
        double[][] b = {{1, 1}, {1, 1}};
        double[][] expResult = {{9, 9}, {9, 9}};
        double[][] result = Matrix.subtract(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Matrix.
     */
    @Test
    public void testMultiply_doubleArrArr_doubleArrArr() {
        System.out.println("multiply");
        double[][] a = {{1, 1}, {1, 1}};
        double[][] b = {{2, 2}, {2, 2}};
        double[][] expResult = {{4, 4}, {4, 4}};
        double[][] result = Matrix.multiply(a, b);
        assertArrayEquals(expResult, result);
    }

}
