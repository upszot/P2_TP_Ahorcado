/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

/**
 *
 * @author gferrer_mecon
 */
public class Palabra
{
    private String _palabra;
    private String _definicion;

    //<editor-fold desc="CONSTRUCTORES">
    
        public Palabra()
        {
        }

    public Palabra(String _palabra, String _definicion) {
        this._palabra = _palabra;
        this._definicion = _definicion;
    }
    
    //</editor-fold>

    //<editor-fold desc="GETT_SET">
        public String getPalabra()
        {
            return _palabra;
        }

        public void setPalabra(String _palabra)
        {
            this._palabra = _palabra;
        }

        public String getDefinicion()
        {
            return _definicion;
        }

        public void setDefinicion(String _definicion)
        {
            this._definicion = _definicion;
        }
        
    //</editor-fold>    
    
     //<editor-fold desc="METODOS">    
    @Override
    public String toString()
    {
        String retorno = "";
            retorno+=this.getPalabra();      
        return retorno;
    }
    
    
    //</editor-fold>
}
