/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis
 */
public class TrianguloTest
{
    
    public TrianguloTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of VerificarTipo method, of class Triangulo.
     */
    @Test
    public void testVerificarTipo()
    {
        /*System.out.println("VerificarTipo");
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        Triangulo instance = new Triangulo();
        String expResult = "";
        String result = instance.VerificarTipo(l1, l2, l3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        Triangulo t = new Triangulo();
        Assert.assertEquals("Isósceles", t.VerificarTipo(1, 2, 2));
    }
    
}
