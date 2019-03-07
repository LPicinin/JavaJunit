/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import junitparams.FileParameters;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

    @Test
    @FileParameters("src\\Arquivo\\triangulo.csv")
    public void VerificarTipo(int l1, int l2, int l3, String resultado)
    {
        Triangulo t = new Triangulo();
        Assert.assertEquals(resultado, t.VerificarTipo(l1, l2, l3));
    }
}
