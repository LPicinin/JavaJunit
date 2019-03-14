/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras;

import junitparams.FileParameters;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class CtrTrianguloTest
{
    
    public CtrTrianguloTest()
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
     * Test of instancia method, of class CtrTriangulo.
     */
    @Test
    public void testInstancia()
    {
        System.out.println("instancia");
        CtrTriangulo expResult = null;
        CtrTriangulo result = CtrTriangulo.instancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valida method, of class CtrTriangulo.
     * @param l1
     * @param l2
     * @param l3
     * @param resultado
     */
    @Test
    @FileParameters("src\\Arquivo\\triangulo.csv")
    public void testValida(int l1, int l2, int l3, String resultado)
    {
        Assert.assertEquals("Equilatero", CtrTriangulo.instancia().valida(l1, l2, l3));
    }
    
}
