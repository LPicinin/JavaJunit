/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Aluno
 */
@RunWith(JUnitParamsRunner.class)
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
    
    @Test
    @FileParameters("src\\Arquivo\\triangulo.csv")
    public void testValida(int l1, int l2, int l3, String resultado)
    {
        CtrTriangulo c = new CtrTriangulo(l1, l2, l3);
        Assert.assertEquals(resultado, c.valida());
    }
}
