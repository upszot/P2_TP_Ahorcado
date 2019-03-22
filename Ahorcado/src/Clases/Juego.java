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
public class Juego
{

    //<editor-fold desc="Atributos">
    private ENivel _dificultad;
    private Palabra palabra_a_buscar;
    private int cantFallosPermitidos;

    private String palabra_del_usuario = "";
    private int cantFallos;
    private int cantAciertos = 0;

    private Diccionario diccionarioCompleto;
    private Diccionario diccionarioFiltrado;
    // </editor-fold>

    //<editor-fold desc="Constructores">
    public Juego() throws DiccionarioCompleto
    {
        this.diccionarioCompleto = Diccionario.cargarDiccionario(Ahorcado.main.pathDiccionario);
        this._dificultad= ENivel.FACIL;
        nuevaPalabra();
        //this.diccionarioFiltrado = diccionarioCompleto.armarDiccionarioNivel(this._dificultad);
    }

    public void nuevaPalabra() throws DiccionarioCompleto
    {
        this.cantFallos = 0;
        this.cantFallosPermitidos = 6; //cuerpito completo       
        this.palabra_a_buscar = this.diccionarioCompleto.getPalabraRandom(); // ver si cambio get por pop
        generaMascara();
        System.out.println(this.palabra_a_buscar);
        System.out.println(this.palabra_del_usuario);
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    public ENivel getDificultad()
    {
        return _dificultad;
    }

    public void setDificultad(ENivel _dificultad)
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

    /**
     * @return the cantFallosPermitidos
     */
    public int getCantFallosPermitidos()
    {
        return cantFallosPermitidos;
    }

    /**
     * @param cantFallosPermitidos the cantFallosPermitidos to set
     */
    public void setCantFallosPermitidos(int cantFallosPermitidos)
    {
        this.cantFallosPermitidos = cantFallosPermitidos;
    }

    /**
     * @return the cantFallos
     */
    public int getCantFallos()
    {
        return cantFallos;
    }

    /**
     * @param cantFallos the cantFallos to set
     */
    public boolean setCantFallos(int cantFallos)
    {
       boolean resp = false;
       if(cantFallos > this.cantFallos)
       {
        this.cantFallos = cantFallos;           
       }
       else{
           resp= true;
       }
       return resp;
   
    }

    /**
     * @return the cantAciertos
     */
    public int getCantAciertos()
    {
        return cantAciertos;
    }

    /**
     * @param cantAciertos the cantAciertos to set
     */
    public void setCantAciertos(int cantAciertos)
    {
        this.cantAciertos = cantAciertos;
    }

    /**
     * @return the diccionarioCompleto
     */
    public Diccionario getDiccionarioCompleto()
    {
        return diccionarioCompleto;
    }

    /**
     * @param diccionarioCompleto the diccionarioCompleto to set
     */
    public void setDiccionarioCompleto(Diccionario diccionarioCompleto)
    {
        this.diccionarioCompleto = diccionarioCompleto;
    }

    /**
     * @return the diccionarioFiltrado
     */
    public Diccionario getDiccionarioFiltrado()
    {
        return diccionarioFiltrado;
    }

    /**
     * @param diccionarioFiltrado the diccionarioFiltrado to set
     */
    public void setDiccionarioFiltrado(Diccionario diccionarioFiltrado)
    {
        this.diccionarioFiltrado = diccionarioFiltrado;
    }

    //</editor-fold>
    //<editor-fold desc="Metodo">
    private void generaMascara()
    {
        this.palabra_del_usuario = new String();

        for (int i = 0; i < this.getPalabra_a_buscar().getPalabra().length(); i++)
        {
            //this.palabra_del_usuario += "*";
            this.palabra_del_usuario += " ";
        }
        System.out.println("usuario palabra: " + this.getPalabra_del_usuario());

    }

    public int BuscaLetraEnPalabra(char letra)
    {
        StringBuilder buffer = new StringBuilder(this.palabra_del_usuario);
        int resp = 1; //char letra=this.tecladoEnPantalla.getLetra();
        String retorno = Character.toString(letra);        
        
        for (int i = 0; i < this.getPalabra_a_buscar().getPalabra().length(); i++)
        {
            if (retorno.equals(Character.toString(this.getPalabra_a_buscar().getPalabra().charAt(i))))
            {//la encontro, aca copio la letra en la posicion de la palabra encontrada
                buffer.setCharAt(i, letra);
                resp = 0;
            }
        }
        this.palabra_del_usuario = buffer.toString();
        System.out.println(this.palabra_del_usuario);
       // generaMascara();
        return resp;
    }

    // </editor-fold>
    //get palabra del diccionario
}
