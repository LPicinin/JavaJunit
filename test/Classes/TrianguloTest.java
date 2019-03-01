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
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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

    public static List<String> getLines() throws IOException
    {
        List<String> l = new ArrayList<>();
        try
        {

            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\Aluno\\Documents\\NetBeansProjects\\JavaJunit\\src\\Arquivo\\triangulo.csv"));
            String line;
            while ((line = br.readLine()) != null)
            {
                l.add(line);
            }
        } catch (Exception ex)
        {
            System.out.println("");
        }
        return l;
    }

    //https://www.wedoqa.com/2014/03/reading-test-data-from-a-csv-file-using-junit/
    @Test
    public void testVerificarTipo()
    {
        List<String> l = new ArrayList<>();
        try
        {
            l = getLines();
        } catch (IOException ex)
        {
            Logger.getLogger(TrianguloTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] line;
        Triangulo t = new Triangulo();
        for (int i = 0; i < l.size(); i++)
        {
            line = l.get(i).split(";");

            Assert.assertEquals(line[3],
                    t.VerificarTipo(Integer.parseInt(line[0]),
                            Integer.parseInt(line[1]),
                            Integer.parseInt(line[2])));
        }
    }
}
