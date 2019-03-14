/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras;

import Classes.Triangulo;

/**
 *
 * @author Aluno
 */
public class CtrTriangulo
{

    private Integer l1;
    private Integer l2;
    private Integer l3;
    
    private static CtrTriangulo ctrTriangulo;

    private CtrTriangulo(Integer l1, Integer l2, Integer l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public static CtrTriangulo instancia(Integer l1, Integer l2, Integer l3)
    {
        if (ctrTriangulo == null)
        {
            ctrTriangulo = new CtrTriangulo(l1, l2, l3);
        }
        return ctrTriangulo;
    }
    public static CtrTriangulo instancia()
    {
        if (ctrTriangulo == null)
        {
            ctrTriangulo = new CtrTriangulo(0,0,0);
        }
        return ctrTriangulo;
    }

    public String valida(int l1, int l2, int l3)
    {
        Triangulo t = new Triangulo(l1, l2, l3);
        if (t.validaDados())
        {
            if (t.validaSoma())
            {
                return t.VerificarTipo();
            }
        }
        return "k";
    }
}
