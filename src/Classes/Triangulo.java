/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author luis
 */
public class Triangulo
{
    private Integer l1;
    private Integer l2;
    private Integer l3;
    public Triangulo()
    {

    }

    public Triangulo(Integer l1, Integer l2, Integer l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    // verificar dados
    // verificar a soma
    public String VerificarTipo()
    {
        if ((l1 == l2) && (l2 == l3) && (l1 == l3))
        {
            return ("Equilatero");
        } else
        {
            if ((l1 != l2) && (l2 != l3) && (l1 != l3))
            {
                return ("Escaleno");
            } else
            {
                return ("Isósceles");
            }
        }
    }

    public boolean validaDados()
    {
        return !(l1 ==0 && l2 == 0 && l3 == 0);
    }

    public boolean validaSoma()
    {
        return ((l1 + l2) >l3) && ((l2 + l3) > l1) && ((l3 + l1) > l2);
    }
}
