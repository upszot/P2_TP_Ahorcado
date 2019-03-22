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

//import java.awt.Container;
//import java.awt.GridLayout;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
//import javax.swing.JLabel;

public class Diccionario
{

    //<editor-fold desc="Atributos">
    public ArrayList<Palabra> lista;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public Diccionario()
    {
        lista = new ArrayList<Palabra>();
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    public void generar()
    {
        lista.add(new Palabra("PARACAIDAS", "Artefacto de tela resistente o de otra materia análoga, que se extiende en el aire en forma de sombrilla grande, cuya función es la de moderar la velocidad de caída de un cuerpo que se arroja desde una aeronave"));
        lista.add(new Palabra("DECORACION", "Arte que estudia la combinación de elementos ornamentales y la acomodación del espacio interior"));
        lista.add(new Palabra("MATRIMONIO", "Antigua institución social, presente en gran cantidad de culturas, que establece un vínculo conyugal entre personas naturales, reconocido y consolidado por medio de prácticas comunitarias y normas legales, consuetudinarias, religiosas o morales"));
        lista.add(new Palabra("REDITO", "Renta, utilidad o beneficio renovable que rinde un capital"));
        lista.add(new Palabra("CUENTA", "Cálculo u operación aritmética.\nCada una de las bolas ensartadas que componen el rosario"));
        lista.add(new Palabra("OVULO", "Células sexuales o gametos femeninos.1​ Son células grandes, esféricas e inmóviles."));
        lista.add(new Palabra("TECHO", "Parte superior de un edificio, construcción, habitáculo, etc., que lo cubre y cierra"));
        lista.add(new Palabra("HORA", "Tiempo que equivale a 60 minutos, es decir, 3600 segundos"));
        lista.add(new Palabra("VIOLIN", "Instrumento musical de cuerda, el más pequeño y agudo entre los de su clase, que se compone de una caja de resonancia en forma de 8, un mástil sin trastes y cuatro cuerdas que se hacen sonar con un arco"));
        lista.add(new Palabra("CINTA", "Tira de tela u otro material de propiedades semejantes que sirve para atar, ceñir o adornar"));
        lista.add(new Palabra("CUERDA", "Conjunto de hilos entrelazados que forman un solo cuerpo largo y flexible que sirve para atar, suspender pesos, etc."));
        lista.add(new Palabra("ZAPATILLA", "Calzado cómodo y ligero, de paño, piel, etc., y con suela delgada, que se usa para estar en casa"));
        lista.add(new Palabra("VENTILADOR", "Instrumento o aparato con aspas giratorias que impulsa o remueve el aire"));

    }
///////////////////////////////////Override

    @Override
    public String toString()
    {
        String retorno = "";
        for (Palabra palabra : this.lista)
        {
            retorno += palabra.toString() + "\n";
        }
        return retorno;
    }

    public static void guardarArchivoDiccionario(Diccionario lista, String nombreArchivo)
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

    public static Diccionario cargarDiccionario(String nombreArchivo)
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

        Diccionario nuevo = (Diccionario) decoder.readObject();

        return nuevo;
    }

    public void quitarPalabra(String nombre)
    {

        boolean encontarda = false;

        for (Palabra palabra : lista)
        {
            if (nombre == palabra.getPalabra())
            {
                this.lista.remove(palabra);
                encontarda = true;
            }
        }

        if (encontarda == false)
        {
            // throw new PalabraNoEncontrada(" La palabra encontrada no se encuentra en el diccionarios");
        }

    }

    public Palabra getPalabraRandom() throws DiccionarioCompleto
    {
        int nroRandom;

        if (this.lista.isEmpty())
        {
            throw new DiccionarioCompleto("diccionario 100% usado");
        }
        else
        {
            nroRandom = funciones.random.Entero_DesdeHasta(0, this.lista.size() - 1);
        }
        return this.lista.get(nroRandom);
    }

    // </editor-fold>
}
