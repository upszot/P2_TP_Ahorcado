/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author gferrer_mecon
 */
public class Ganador
{
    //linea del score   Nombre  Nivel   Cantidad Palabras
    //                  juan    facil       10
    
    private String _nombre;
    private ENivel _nivel;
    private int _cantidad_palabras;
    
    //<editor-fold desc="CONSTRUCTOR">    

    public Ganador()
    {
    }
    
    
        public Ganador(String _nombre)
        {
            this._nombre = _nombre;
        }

        public Ganador(String _nombre, ENivel _nivel, int _cantidad_palabras)
        {
            this._nombre = _nombre;
            this._nivel = _nivel;
            this._cantidad_palabras = _cantidad_palabras;
        }
    //</editor-fold>
        
    //<editor-fold desc="GET&SET">
        public String getNombre()
        {
            return _nombre;
        }

        public void setNombre(String _nombre)
        {
            this._nombre = _nombre;
        }

        public ENivel getNivel()
        {
            return _nivel;
        }

        public void setNivel(ENivel _nivel)
        {
            this._nivel = _nivel;
        }

        public int getCantidad_palabras()
        {
            return _cantidad_palabras;
        }

        public void setCantidad_palabras(int _cantidad_palabras)
        {
            this._cantidad_palabras = _cantidad_palabras;
        }
        
        public String getGanador()
        {
            StringBuffer retorno = new StringBuffer();
            retorno.append(this._nombre).append("      ");
            //retorno.append(this._nivel).append("    ");
            retorno.append(this._cantidad_palabras);
            return  retorno.toString();
        }    
    //</editor-fold>
    
    @Override
    public String toString() {
        return this.getGanador();
    }
        
        
}
