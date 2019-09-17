/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author upszot
 */
public class Score
{

    public ArrayList<Ganador> lista;
    public int CantidadMostrar;      


    public Score()
    {
        lista = new ArrayList<>();
        CantidadMostrar = 5;
    }
    
    public void generar()
    {
        lista.add(new Ganador("Gonzalo", ENivel.FACIL, 2));
        lista.add(new Ganador("pedro", ENivel.FACIL, 1));
        lista.add(new Ganador("upszot", ENivel.FACIL, 5));
        lista.add(new Ganador("Alejandro", ENivel.FACIL, 3));
        lista.add(new Ganador("caro", ENivel.FACIL, 1));
        lista.add(new Ganador("nano", ENivel.FACIL, 4));        

    }

    public void addToScore(Ganador nuevo)
    {
        lista.add(nuevo);

    }

    @Override
    public String toString()
    {
        String retorno= "";
        for (Ganador unGanador : lista)
        {
             retorno += unGanador.toString() + "\n";            
        }
        return retorno;        
    }

    public ArrayList<Ganador> getListaGanadores()
    {
        return lista;
    }

    public  int getCantidadMostrar()
    {
        return CantidadMostrar;
    }

    public  int getSize()
    {
        return this.lista.size();
    }

    
    public static void guardarArchivoScore(Score lista, String nombreArchivo)
    {
        XMLEncoder encoder = null;

        try
        {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            BufferedOutputStream salida = new BufferedOutputStream(file);
            encoder = new XMLEncoder(salida);
        }
        catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- file not found");
        }

        encoder.writeObject(lista);
        encoder.close();
    }

    /**
     *
     *
     */
    public static Score cargarScore(String nombreArchivo)
    {
        XMLDecoder decoder = null;

        try
        {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(nombreArchivo)));
        }
        catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- file not found");
        }

        Score nuevo = (Score) decoder.readObject();

        return nuevo;
    }
    
    public static final Comparator<Ganador> armarRanking = (Ganador user1, Ganador  user2) ->
    {
        return (int) Math.signum(user2.getCantidad_palabras()- user1.getCantidad_palabras());
    };

}
