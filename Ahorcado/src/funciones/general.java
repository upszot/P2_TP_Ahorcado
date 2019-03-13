/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author gferrer_mecon
 */
public class general
{

    public boolean validar_palabra(String palabra)
    {
        boolean retorno = false;
        if (palabra != null)
        {
            for (int i = 0; i < palabra.length(); i++)
            {
                if (!Character.isAlphabetic(palabra.charAt(i)))
                {
                    retorno = true;
                    break;

                }
            }
        }
        return retorno;
    }
}
