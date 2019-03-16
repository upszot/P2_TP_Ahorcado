/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import Clases.Diccionario;
import Clases.Score;

/**
 *
 * @author upszot
 */
public class main {

    public static String pathDiccionario = "Diccionario.xml";
    public static String pathScore= "score.xml";
    
    public static void main(String[] args) 
    {
       generarLIstas();
         
     //  Juego  nuevoJuego = new Juego();
        
         
    }

    /**
     *
     */
    public static void generarLIstas()
    {        
        Diccionario diccionario1 = new Diccionario();
        diccionario1.generar();       
        Diccionario.guardarArchivoDiccionario(diccionario1, pathDiccionario );
       
        Score score = new Score();
        score.generar();       
        Score.guardarArchivoScore(score, pathScore);
    }
}
