/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author upszot
 */
public class DiccionarioCompleto extends Exception
{

    /**
     * Creates a new instance of <code>DiccionarioCompleto</code> without detail
     * message.
     */
    public DiccionarioCompleto()
    {
    }

    /**
     * Constructs an instance of <code>DiccionarioCompleto</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DiccionarioCompleto(String msg)
    {
        super(msg);
    }
}
