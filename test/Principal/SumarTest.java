/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haiber
 */
public class SumarTest {
    
    public SumarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CSuma method, of class Sumar.
     */
    @Test
    public void testCSuma() {
        System.out.println("CSuma");
        double v1 = 6.0;
        double v2 = 4.0;
        Sumar instance = new Sumar();
        double expResult = 10.0;
        double result = instance.CSuma(v1, v2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of CResta method, of class Sumar.
     */
    @Test
    public void testCResta() {
        System.out.println("CResta");
        double v1 = 6.0;
        double v2 = 4.0;
        Sumar instance = new Sumar();
        double expResult = 2.0;
        double result = instance.CResta(v1, v2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
