/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import Clases.DiccionarioCompleto;
import Clases.Score;
import Clases.Ganador;
import Clases.ISonidos;
import Clases.Juego;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author upszot
 */
public class Frm_juego extends javax.swing.JInternalFrame implements ISonidos
{

    private Teclado tecladoEnPantalla;
    private Juego nuevoJuego;

    private Ganador player;

    private JButton botones[] = new JButton[27];
    private char letra;
    Container cp;
    Container cr;

    /**
     * Creates new form NewJInternalFrame
     */
    public Frm_juego()
    {
     //   sonidoCargarRevolver();
        this.setContentPane(new JLabel(new ImageIcon("imagenes/fondo.jpg")));
        miCustomCursor();

        initComponents();
        try
        {
            iniciarJuego();
        }
        catch (DiccionarioCompleto ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        iniciarTeclado();
        //  this.nuevoJuego.BuscaLetraEnPalabra(this.tecladoEnPantalla.getLetra());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panelTeclado = new javax.swing.JLayeredPane();
        panelNombre = new javax.swing.JPanel();
        boxTituloNombre = new javax.swing.JLabel();
        boxNombre = new javax.swing.JTextField();
        panelPalabra = new javax.swing.JScrollPane();
        jtPalabra = new javax.swing.JTable();
        panelImagen = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(626, 600));
        setMinimumSize(new java.awt.Dimension(626, 600));
        setPreferredSize(new java.awt.Dimension(626, 600));

        panelTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTeclado.setMaximumSize(new java.awt.Dimension(580, 159));
        panelTeclado.setMinimumSize(new java.awt.Dimension(580, 159));
        panelTeclado.setName(""); // NOI18N
        panelTeclado.setRequestFocusEnabled(false);
        panelTeclado.setVerifyInputWhenFocusTarget(false);

        panelNombre.setMaximumSize(new java.awt.Dimension(400, 100));
        panelNombre.setMinimumSize(new java.awt.Dimension(400, 100));
        panelNombre.setOpaque(false);
        panelNombre.setPreferredSize(new java.awt.Dimension(420, 100));

        boxTituloNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boxTituloNombre.setForeground(new java.awt.Color(255, 255, 255));
        boxTituloNombre.setText("ingrese su nombre");

        boxNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        boxNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        boxNombre.setToolTipText("");
        boxNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                boxNombreKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelNombreLayout = new javax.swing.GroupLayout(panelNombre);
        panelNombre.setLayout(panelNombreLayout);
        panelNombreLayout.setHorizontalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNombreLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxTituloNombre)
                    .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        panelNombreLayout.setVerticalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTituloNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(6, Short.MAX_VALUE))
        );

        panelTeclado.setLayer(panelNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelTecladoLayout = new javax.swing.GroupLayout(panelTeclado);
        panelTeclado.setLayout(panelTecladoLayout);
        panelTecladoLayout.setHorizontalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTecladoLayout.setVerticalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelPalabra.setBorder(null);
        panelPalabra.setOpaque(false);

        jtPalabra.setBackground(new java.awt.Color(102, 51, 0));
        jtPalabra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtPalabra.setForeground(new java.awt.Color(255, 255, 255));
        jtPalabra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jtPalabra.setAutoscrolls(false);
        jtPalabra.setMaximumSize(new java.awt.Dimension(580, 57));
        jtPalabra.setMinimumSize(new java.awt.Dimension(580, 57));
        jtPalabra.setOpaque(false);
        jtPalabra.setPreferredSize(new java.awt.Dimension(580, 57));
        jtPalabra.setRowHeight(90);
        jtPalabra.setRowSelectionAllowed(false);
        jtPalabra.setShowHorizontalLines(false);
        jtPalabra.getTableHeader().setReorderingAllowed(false);
        panelPalabra.setViewportView(jtPalabra);

        panelImagen.setMaximumSize(new java.awt.Dimension(613, 282));
        panelImagen.setMinimumSize(new java.awt.Dimension(613, 282));
        panelImagen.setOpaque(false);
        panelImagen.setPreferredSize(new java.awt.Dimension(613, 282));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelPalabra, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBox2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtBox2ActionPerformed
    {//GEN-HEADEREND:event_txtBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBox2ActionPerformed

    private void txtBox2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtBox2KeyTyped
    {//GEN-HEADEREND:event_txtBox2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBox2KeyTyped

    private void boxNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_boxNombreKeyPressed
    {//GEN-HEADEREND:event_boxNombreKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_boxNombreKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxNombre;
    private javax.swing.JLabel boxTituloNombre;
    private javax.swing.JTable jtPalabra;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JScrollPane panelPalabra;
    private javax.swing.JLayeredPane panelTeclado;
    // End of variables declaration//GEN-END:variables

//------------- METODOS
    public void miCustomCursor()
    {
        String imgCursor1 = "imagenes/cursor1.cur"; //este no lo muestra
        String imgCursor2 = "imagenes/cursor2.png";
        String imgCursor3 = "imagenes/cursor3.png"; //el que mejor se ve...
        ImageIcon imagen = new ImageIcon(imgCursor3);

        Cursor miCursor;
        Toolkit TK = Toolkit.getDefaultToolkit();

        miCursor = TK.createCustomCursor(imagen.getImage(), new Point(0, 0), "Cursor");
        this.setCursor(miCursor);
    }

    private void iniciarJuego() throws DiccionarioCompleto
    {
        setNuevoJuego(new Juego());
        actualizarImagen(0);
        showTablaPalabra(this.nuevoJuego.getPalabra_del_usuario());
 
    }

    private void showTablaPalabra(String mascara)
    {
        System.out.println("Palabra: " + this.getNuevoJuego().getPalabra_a_buscar().getPalabra()
                + " CantCaracteres: " + this.getNuevoJuego().getPalabra_a_buscar().getPalabra().length());

        DefaultTableModel tb = new DefaultTableModel();
        tb.setNumRows(1);
        tb.setRowCount(1);

        jtPalabra.setShowGrid(true);
        //----- Tratando de centrar el texto de la celda...
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        tcr.setVerticalTextPosition((int) CENTER_ALIGNMENT);
//        ((DefaultTableCellRenderer) jtPalabra.getDefaultRenderer(Object.class)).setVerticalTextPosition((int) CENTER_ALIGNMENT);
//        ((DefaultTableCellRenderer) jtPalabra.getDefaultRenderer(Object.class)).setHorizontalTextPosition((int) CENTER_ALIGNMENT);

        //--------- Tabla Transparente ------
        jtPalabra.setOpaque(false);
        jtPalabra.setBackground(new Color(0, 0, 0));
        ((DefaultTableCellRenderer) jtPalabra.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0));
        ((DefaultTableCellRenderer) jtPalabra.getDefaultRenderer(Object.class)).setOpaque(false);
        jtPalabra.setGridColor(Color.WHITE);
        jtPalabra.setForeground(Color.WHITE);

        panelPalabra.setBackground(new Color(0, 0, 0));
        panelPalabra.setOpaque(false);
        panelPalabra.getViewport().setOpaque(false);
        //------------------------------------

        for (int i = 0; i < this.getNuevoJuego().getPalabra_a_buscar().getPalabra().length(); i++)
        {
            tb.addColumn(" ");
        }
        getJtPalabra().setModel(tb);
        getJtPalabra().setVisible(true);

        for (int i = 0; i < this.getNuevoJuego().getPalabra_a_buscar().getPalabra().length(); i++)
        {
            jtPalabra.setValueAt(mascara.charAt(i), 0, i);
            //jtPalabra.getColumnModel().getColumn(i).setCellRenderer(tcr);// si uso este y no uso el tcr para transparencia este me la pisa..
        }
        jtPalabra.setAutoscrolls(false);
        jtPalabra.setTableHeader(null);
    }

    /*   private void showTeclado()
    {
        Container cp = getPanelTeclado();
        GridLayout gl = new GridLayout(1, 1);
        cp.setLayout(gl);      

        cp.add(iniciarTeclado());
        getTecladoEnPantalla().setVisible(true);
    }
     */
    private void focoTeclado()
    {
        this.getNuevoJuego().BuscaLetraEnPalabra(this.getTecladoEnPantalla().getLetra());
        System.out.println("Tecla presionada: " + this.getTecladoEnPantalla().getLetra());
        System.out.println("Palabra encontrada: " + this.getNuevoJuego().getPalabra_del_usuario());
    }

    /**
     * @return the nuevoJuego
     */
    public Juego getNuevoJuego()
    {
        return nuevoJuego;
    }

    //<editor-fold desc="GETTERS&SETTERS">    
    public void setLetra(java.awt.event.ActionEvent letra)
    {
        JButton eventoBoton = (JButton) letra.getSource();
        eventoBoton.setText("");
        eventoBoton.setEnabled(false);

        String aux = letra.getActionCommand();
        this.setLetra(aux.charAt(0));

        System.out.println("A pretado el boton " + eventoBoton.getActionCommand());
    }

    public char getLetra()
    {
        return letra;
    }
    //</editor-fold>

    public void iniciarTeclado()
    {
        this.panelNombre.setVisible(false);
        cp = this.panelTeclado;
        GridLayout gl = new GridLayout(3, 10);
        gl.setHgap(2);
        gl.setVgap(2);
        cp.setLayout(gl);
        cp.setMaximumSize(new Dimension(530, 200));

        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        //centrar iconos

        for (int i = 0; i < letras.length(); i++)
        {
            this.getBotones()[i] = new JButton();
            cp.add(getBotones()[i]);
            this.getBotones()[i].setText(String.valueOf(letras.charAt(i)));
            this.getBotones()[i].setFont(new Font("Tahoma", 0, 20));
            this.getBotones()[i].setVisible(true);
            this.getBotones()[i].setForeground(new Color(255, 255, 255));
            this.getBotones()[i].setContentAreaFilled(false); //Boton Transparente
            this.getBotones()[i].setBorderPainted(false);
            this.getBotones()[i].setBorder(null);

            this.getBotones()[i].addActionListener(new ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    setLetra(evt);
                    try
                    {
                        recibirDeTeclado(getLetra());

                        //    this.nuevoJuego.BuscaLetraEnPalabra(this.tecladoEnPantalla.getLetra());
                    }
                    catch (DiccionarioCompleto ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            });//fin escuchador            

        }// FIN for (int i = 0; i < letras.length(); i++)
    }

    /**
     * @return the tecladoEnPantalla
     */
    public void recibirDeTeclado(char letra1) throws DiccionarioCompleto
    {
        if (!this.nuevoJuego.setCantFallos(this.nuevoJuego.getCantFallos() + this.nuevoJuego.BuscaLetraEnPalabra(letra1)))
        {
            actualizarImagen(this.nuevoJuego.getCantFallos());
            System.out.println("Fallo letra - Cambio Actualizo imagen");
        }

        if (this.nuevoJuego.getPalabra_a_buscar().getPalabra().compareToIgnoreCase(this.nuevoJuego.getPalabra_del_usuario()) == 0)
        {//Comparo palabras a buscar y la ingresada y le pego...wiii gano... PROXIMA PALABRA
            showTablaPalabra(this.nuevoJuego.getPalabra_del_usuario());
            this.nuevoJuego.setCantAciertos(this.nuevoJuego.getCantAciertos() + 1); //palabras acertadas
            System.out.println(" Palabra Correcta " + this.nuevoJuego.getPalabra_del_usuario());
            JOptionPane.showMessageDialog(this, " Palabra Correcta " + this.nuevoJuego.getPalabra_del_usuario());
            this.nuevoJuego.nuevaPalabra();
            this.limpiarPanelJuego();
        }

        else
        {
            if (this.nuevoJuego.getCantFallos() == this.nuevoJuego.getCantFallosPermitidos())
            {   //hee le erraste todas...chinguenguenza
                System.out.println("Perdiste.... " + this.nuevoJuego.getCantAciertos());
                JOptionPane.showMessageDialog(this, " Perdiste!! le erraste todas...chinguenguenza, La palabra era:  " + this.nuevoJuego.getPalabra_a_buscar());

                if (this.nuevoJuego.getCantAciertos() >= 0) //// *****aca va 1... pongo 0 solo para testiar
                {//anotate en lista ganadores
                    System.out.println("entro Anota ganador");

                    this.panelTeclado.removeAll();
                    cp.removeAll();
                    this.panelTeclado.repaint();
                    cp = this.panelTeclado;
                    GridLayout gl = new GridLayout(1, 2);

                    cp.setLayout(gl);
                    cp.add(panelNombre);

                    this.panelNombre.setVisible(true);
                    this.boxNombre.addKeyListener(new KeyListener()
                    {
                        @Override
                        public void keyTyped(KeyEvent e)
                        {
                            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }

                        @Override
                        public void keyPressed(KeyEvent e)
                        {
                            if (e.getKeyCode() == KeyEvent.VK_ENTER)
                            {
                                setPlayer(new Ganador(boxNombre.getText(), nuevoJuego.getDificultad(), nuevoJuego.getCantAciertos()));
                                System.out.println(getPlayer().toString());
                                abrirAgregarGuardar(getPlayer());
                                ocultar();
                                panelNombre.setVisible(false);
                            }
                            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }

                        @Override
                        public void keyReleased(KeyEvent e)
                        {
                            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                    });

                    cp.repaint();

                }
                else
                {
                    this.setVisible(false);
                }
            }
        }
        //aca refresco la pantalla

        showTablaPalabra(this.nuevoJuego.getPalabra_del_usuario());
    }

    public void ocultar()
    {
        this.setVisible(false);
    }

    private void limpiarPanelJuego()
    {
        cp.removeAll();
        actualizarImagen(this.nuevoJuego.getCantFallos()); // antes de actualizar teclado pq sino queda mal renderizado y hay q mover la ventana para q se vea bien...
        iniciarTeclado();
        showTablaPalabra(this.nuevoJuego.getPalabra_del_usuario());
    }

    public Teclado getTecladoEnPantalla()
    {
        return tecladoEnPantalla;
    }

    /**
     * @param tecladoEnPantalla the tecladoEnPantalla to set
     */
    public void setTecladoEnPantalla(Teclado tecladoEnPantalla)
    {
        this.tecladoEnPantalla = tecladoEnPantalla;
    }

    /**
     * @param nuevoJuego the nuevoJuego to set
     */
    public void setNuevoJuego(Juego nuevoJuego)
    {
        this.nuevoJuego = nuevoJuego;
    }

    /**
     * @return the botones
     */
    public JButton[] getBotones()
    {
        return botones;
    }

    /**
     * @param botones the botones to set
     */
    public void setBotones(JButton[] botones)
    {
        this.botones = botones;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra)
    {
        this.letra = letra;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1()
    {
        return panelPalabra;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1)
    {
        this.panelPalabra = jScrollPane1;
    }

    /**
     * @return the jtPalabra
     */
    public javax.swing.JTable getJtPalabra()
    {
        return jtPalabra;
    }

    /**
     * @param jtPalabra the jtPalabra to set
     */
    public void setJtPalabra(javax.swing.JTable jtPalabra)
    {
        this.jtPalabra = jtPalabra;
    }

    private void abrirAgregarGuardar(Ganador player)
    {
        Score scoreAux;
        if (player.getNombre().length() > 0)
        {
            scoreAux = Score.cargarScore(Ahorcado.main.pathScore);
            scoreAux.addToScore(player);
            JOptionPane.showMessageDialog(this, "Agregado");
            System.out.println("agregado");
            Score.guardarArchivoScore(scoreAux, Ahorcado.main.pathScore);
            // System.out.println("Lista Guardada con Exito");
        }

    }

    public void actualizarImagen(int intento)
    {
        if (intento>0)
        sonidoCargarRevolver();
        
        if (this.panelImagen != null)
        {
            this.panelImagen.removeAll();
        }

        Container cp = this.panelImagen;
        GridLayout gl = new GridLayout(1, 1);
        cp.setLayout(gl);
        //ImageIcon tiros = new ImageIcon("imagenes/tiro_0" + intento + ".png");
        ImageIcon tiros = new ImageIcon("imagenes/Nuevo_tiro_0" + intento + ".png");
        JLabel lblImagen = new JLabel(tiros);
        cp.add(lblImagen);
    }

    public Ganador getPlayer()
    {
        return player;
    }

    public void setPlayer(Ganador player)
    {
        this.player = player;
    }

    @Override
    public void sonidoCargarRevolver()
    {
        System.out.println("Reproduccir sonido carga");        
        //Clip soundClip;
        String archSonido = "C:\\Users\\upszot\\Desktop\\P2_TP_Ahorcado\\Ahorcado\\Sonidos\\Disparo_Magnum357.wav";
        try
        {
            //soundClip = AudioSystem.getClip();
            //soundClip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(archSonido)));
            //soundClip.start();

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(archSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch (IOException | UnsupportedAudioFileException | LineUnavailableException e)
        {
        }

    }

    @Override
    public void sonidoDisparo()
    {

    }
}
