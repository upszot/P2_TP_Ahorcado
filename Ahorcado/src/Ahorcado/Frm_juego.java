/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import Clases.Score;
import Clases.Ganador;
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
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.JTable.AUTO_RESIZE_OFF;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author upszot
 */
public class Frm_juego extends javax.swing.JInternalFrame
{

    private Teclado tecladoEnPantalla;
    private Juego nuevoJuego;

    private JButton botones[] = new JButton[27];
    private char letra;
    Container cp;
    Container cr;

    JLabel lblPlayer;
    JTextField nombre;

    /**
     * Creates new form NewJInternalFrame
     */
    public Frm_juego()
    {
        this.setContentPane(new JLabel(new ImageIcon("imagenes/fondo.jpg")));
        miCustomCursor();

        initComponents();
        iniciarJuego();
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
        panelPalabra = new javax.swing.JScrollPane();
        jtPalabra = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(626, 521));
        setMinimumSize(new java.awt.Dimension(626, 521));
        setPreferredSize(new java.awt.Dimension(626, 521));

        panelTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTeclado.setMaximumSize(new java.awt.Dimension(580, 159));
        panelTeclado.setMinimumSize(new java.awt.Dimension(580, 159));
        panelTeclado.setName(""); // NOI18N
        panelTeclado.setPreferredSize(new java.awt.Dimension(580, 159));
        panelTeclado.setRequestFocusEnabled(false);
        panelTeclado.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelTecladoLayout = new javax.swing.GroupLayout(panelTeclado);
        panelTeclado.setLayout(panelTecladoLayout);
        panelTecladoLayout.setHorizontalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        panelTecladoLayout.setVerticalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        panelPalabra.setBackground(null);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPalabra)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jtPalabra;
    private javax.swing.JScrollPane panelPalabra;
    private javax.swing.JLayeredPane panelTeclado;
    // End of variables declaration//GEN-END:variables

//------------- METODOS
    public void miCustomCursor() 
    {        
        String imgCursor1="imagenes/cursor1.cur"; //este no lo muestra
        String imgCursor2="imagenes/cursor2.png";
        String imgCursor3="imagenes/cursor3.png"; //el que mejor se ve...
        ImageIcon imagen=new ImageIcon(imgCursor3);
        
        Cursor miCursor;
        Toolkit TK =  Toolkit.getDefaultToolkit();
        
        miCursor = TK.createCustomCursor(imagen.getImage(), new Point(0,0),"Cursor");
        this.setCursor(miCursor);
    }
        
    private void iniciarJuego()
    {
        setNuevoJuego(new Juego());
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
        ((DefaultTableCellRenderer)jtPalabra.getDefaultRenderer(Object.class)).setVerticalTextPosition((int) CENTER_ALIGNMENT);
        ((DefaultTableCellRenderer)jtPalabra.getDefaultRenderer(Object.class)).setHorizontalTextPosition((int) CENTER_ALIGNMENT);

        //--------- Tabla Transparente ------
        jtPalabra.setOpaque(false);        
        jtPalabra.setBackground(new Color(0,0, 0));
        ((DefaultTableCellRenderer)jtPalabra.getDefaultRenderer(Object.class)).setBackground(new Color(0,0, 0));        
        ((DefaultTableCellRenderer)jtPalabra.getDefaultRenderer(Object.class)).setOpaque(false);
        jtPalabra.setGridColor(Color.WHITE);
        jtPalabra.setForeground(Color.WHITE);
        
        panelPalabra.setBackground(new Color(0,0,0));
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
            //jtPalabra.setValueAt(" ", 0, i);

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
            this.getBotones()[i].setContentAreaFilled(false);
            this.getBotones()[i].setBorderPainted(false);
            this.getBotones()[i].setBorder(null);

            this.getBotones()[i].addActionListener(new ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    setLetra(evt);
                    recibirDeTeclado(getLetra());

                    //    this.nuevoJuego.BuscaLetraEnPalabra(this.tecladoEnPantalla.getLetra());
                }
            });//fin escuchador            

        }// FIN for (int i = 0; i < letras.length(); i++)
    }

    /**
     * @return the tecladoEnPantalla
     */
    public void recibirDeTeclado(char letra1)
    {
        this.nuevoJuego.setCantFallos(this.nuevoJuego.getCantFallos() + this.nuevoJuego.BuscaLetraEnPalabra(letra1));

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
            {//hee le erraste todas...chinguenguenza
                System.out.println("Perdiste.... " + this.nuevoJuego.getCantAciertos());
                JOptionPane.showMessageDialog(this, " Perdiste!! le erraste todas...chinguenguenza, La palabra era:  " + this.nuevoJuego.getPalabra_a_buscar());

                if (this.nuevoJuego.getCantAciertos() >= 1)
                {//anotate en lista ganadores
                    System.out.println("entro");

                    this.panelTeclado.removeAll();
                    cp.removeAll();
                    this.panelTeclado.repaint();
                    cp = this.panelTeclado;
                    GridLayout gl = new GridLayout(1, 1);
                    cp.setLayout(gl);
                    cp.setMaximumSize(new Dimension(530, 200));
                    puntos ingreseNombre = new puntos();
                    cp.add(ingreseNombre);
                    ingreseNombre.setVisible(true);
                    ingreseNombre.addComponentListener(new ComponentListener()
                    {
                        @Override
                        public void componentResized(ComponentEvent e)
                        {
                            //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }

                        @Override
                        public void componentMoved(ComponentEvent e)
                        {
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }

                        @Override
                        public void componentShown(ComponentEvent e)
                        {
                            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }

                        @Override
                        public void componentHidden(ComponentEvent e)
                        {
                            Ganador player = new Ganador(ingreseNombre.getPlayer(), nuevoJuego.getDificultad(), nuevoJuego.getCantAciertos());

                            //Score.addtoScore*player();
                            System.out.println(player.toString());
                            abrirAgregarGuardar(player);
                            ocultar();

                            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                    });
                    cp.repaint();

                    /*   lblPlayer = new JLabel("ingrese su nombre: ");
                    nombre = new JTextField();
                    cp.add(lblPlayer);
                    cp.add(nombre);
                    lblPlayer.setVisible(true);
                    nombre.setVisible(true);*/
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
        iniciarTeclado();
        showTablaPalabra(this.nuevoJuego.getPalabra_del_usuario());
        // limpiar dibujo

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
            scoreAux=Score.cargarScore(Ahorcado.main.pathScore);
            scoreAux.addToScore(player);
            JOptionPane.showMessageDialog(this, "Agregado");
            System.out.println("agregado");
           Score.guardarArchivoScore(scoreAux,Ahorcado.main.pathScore);
               // System.out.println("Lista Guardada con Exito");
           
        }

    }
}
