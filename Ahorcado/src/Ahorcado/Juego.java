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
public class Juego
{

    //<editor-fold desc="Atributos">
    private byte _dificultad;
    private Palabra palabra_a_buscar;
    private int cantFallosPermitidos;

    private String palabra_del_usuario;
    private int cantFallos;
    private int cantAciertos;

    private Diccionario diccionarioCompleto;
    private Diccionario diccionarioFiltrado;
    // </editor-fold>

    //<editor-fold desc="Constructores">
    public Juego()
    {
        this.cantFallos = 0;
        this.cantAciertos = 0;
        this.cantFallosPermitidos = 6; //cuerpito completo

        this.diccionarioCompleto = Diccionario.cargarDiccionario(Ahorcado.main.pathDiccionario);
        this.palabra_a_buscar = this.diccionarioCompleto.getPalabraRandom(); // ver si cambio get por pop
        generaMascara();
        //this.diccionarioFiltrado = diccionarioCompleto.armarDiccionarioNivel(this._dificultad);
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    public byte getDificultad()
    {
        return _dificultad;
    }

    public void setDificultad(byte _dificultad)
    {
        this._dificultad = _dificultad;
    }

    public Palabra getPalabra_a_buscar()
    {
        return palabra_a_buscar;
    }

    public void setPalabra_a_buscar(Palabra palabra_a_buscar)
    {
        this.palabra_a_buscar = palabra_a_buscar;
    }

    public String getPalabra_del_usuario()
    {
        return palabra_del_usuario;
    }

    public void setPalabra_del_usuario(String palabra_del_usuario)
    {
        this.palabra_del_usuario = palabra_del_usuario;
    }

    //</editor-fold>
    //<editor-fold desc="Metodo">
    private void generaMascara()
    {
        for (int i = 0; i < this.palabra_a_buscar.getPalabra().length(); i++)
        {
            this.palabra_del_usuario += ' ';
        }
    }

    public void BuscaLetraEnPalabra(char letra)
    {
        //char letra=this.tecladoEnPantalla.getLetra();

        for (int i = 0; i < this.palabra_a_buscar.getPalabra().length(); i++)
        {
            if (letra == this.palabra_a_buscar.getPalabra().charAt(i))
            {//la encontro, aca copio la letra en la posicion de la palabra encontrada
                this.palabra_del_usuario.replace(this.palabra_del_usuario.charAt(i), letra);
            }
        }
    }
    // </editor-fold>

    //get palabra del diccionario
}
