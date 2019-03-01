/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

    /**
     * Test of VerificarTipo method, of class Triangulo.
     */
    @Test
    public void testVerificarTipo() throws IOException
    {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/picinin/NetBeansProjects/JavaJunit/src/Arquivo/triangulo.csv")))
        {
            String line = br.readLine();
            while ((line = br.readLine()) != null)
            {
                try
                {
                    String[] values = line.split(";");
                    Triangulo t = new Triangulo();
                    //System.out.println(line);
                    Assert.assertEquals(values[3],
                            t.VerificarTipo(Integer.parseInt(values[0]),
                                    Integer.parseInt(values[1]),
                                    Integer.parseInt(values[2])));
                }catch(Exception ex)
                {
                    //System.out.println(ex.getMessage());
                }

                //records.add(Arrays.asList(values));
            }
        }
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
