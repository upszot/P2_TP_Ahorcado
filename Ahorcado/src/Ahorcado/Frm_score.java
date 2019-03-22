/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import static Ahorcado.main.pathScore;
import Clases.Score;
import Clases.Ganador;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Comparator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author upszot
 */
public class Frm_score extends javax.swing.JInternalFrame
{

    private Ganador unGanador;
    private Score listaGanadore = new Score();
    private JLabel[] lblGanadores;

    public Ganador getUnGanador()
    {
        return unGanador;
    }

    public void setUnGanador(Ganador unGanador)
    {
        this.unGanador = unGanador;
    }

    /**
     * Creates new form frm_score
     */
    public Frm_score()
    {
        System.out.println("Cantidad de ganadores: " + this.listaGanadore.getSize());
        this.listaGanadore = Score.cargarScore(Ahorcado.main.pathScore);
        this.lblGanadores = new JLabel[this.listaGanadore.CantidadMostrar + 1];

        //String fondo = "imagenes/agujero-vidrio_01.jpg";
        //String fondo = "imagenes/agujero-vidrio_02.jpg";
        //String fondo = "imagenes/agujero-vidrio_03.png"; //tiro anterior
        String fondo = "imagenes/agujero-vidrio_04.png";

        this.setContentPane(new JLabel(new ImageIcon(fondo)));
        initComponents();
        miCustomCursor();
        mostrar_Ganadores();
    }

    public Frm_score(Ganador ganador)
    {
        this();
        this.unGanador = ganador;
        mostrar_UltimoGanador();
    }

    public void miCustomCursor()
    {
        //String imgCursor1 = "imagenes/cursor1.cur"; //este no lo muestra
        //String imgCursor2 = "imagenes/cursor2.png";
        String imgCursor3 = "imagenes/cursor3.png"; //el que mejor se ve...
        ImageIcon imagen = new ImageIcon(imgCursor3);

        Cursor miCursor;
        Toolkit TK = Toolkit.getDefaultToolkit();

        miCursor = TK.createCustomCursor(imagen.getImage(), new Point(0, 0), "Cursor");      
        this.setCursor(miCursor);
    }

    private void mostrar_Ganadores()
    {// aca va el for con el tostring para mostrar un ganador en los label.. que se va moviendo tipo titulo
        {
            Container cp = this.panelListado;
            this.panelListado.setMaximumSize(new Dimension(600,190));
            this.panelPlayer.setMaximumSize(new Dimension(600,90));
        
            GridLayout gl = new GridLayout(this.listaGanadore.CantidadMostrar + 1, 1);
            gl.setHgap(20);       gl.setVgap(10);
            cp.setLayout(gl);

            Score listaAux = this.listaGanadore;
            listaAux.getListaGanadores().sort(Score.armarRanking);
            this.lblGanadores[0] = new JLabel();
            cp.add(this.lblGanadores[0]);
            this.lblGanadores[0].setFont(new Font("Tahoma", 1, 20));
            this.lblGanadores[0].setVerticalAlignment((int) CENTER_ALIGNMENT);
            this.lblGanadores[0].setHorizontalAlignment((int) CENTER_ALIGNMENT);
            this.lblGanadores[0].setForeground(new Color(255, 255, 200));
            this.lblGanadores[0].setText("PLAYER    PALABRAS");
            this.lblGanadores[0].setVisible(true);

            for (int i = 0; i < (this.listaGanadore.CantidadMostrar); i++)
            {
                this.lblGanadores[i + 1] = new JLabel();
                cp.add(this.lblGanadores[i + 1]);
                this.lblGanadores[i + 1].setFont(new Font("Tahoma", 1, 28));
                this.lblGanadores[i + 1].setVerticalAlignment((int) CENTER_ALIGNMENT);
                this.lblGanadores[i + 1].setHorizontalAlignment((int) CENTER_ALIGNMENT);
                this.lblGanadores[i + 1].setForeground(new Color(255, 255, 255));
                this.lblGanadores[i + 1].setText(listaAux.getListaGanadores().get(i).toString());
                this.lblGanadores[i + 1].setVisible(true);
            }
            
            //cp

        }
    }

    private void mostrar_UltimoGanador()
    {// muestra el ultimo jugar que anoto
        {
            Container cp = this.panelPlayer;
            GridLayout gl = new GridLayout(1, 1);
            gl.setHgap(20);       gl.setVgap(10);
            cp.setLayout(gl);

            JLabel ultimoGanador = new JLabel();
            cp.add(ultimoGanador);
            ultimoGanador.setFont(new Font("Tahoma", 1, 30));
            ultimoGanador.setVerticalAlignment((int) CENTER_ALIGNMENT);
            ultimoGanador.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            if (this.getUnGanador() != null)
            {
                ultimoGanador.setText(this.getUnGanador().toString());
            }
//            ultimoGanador.setText(this.listaGanadore.getListaGanadores().get(0).toString());
            ultimoGanador.setForeground(new Color(255, 255, 255));
            ultimoGanador.setVisible(true);
        }
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

        jLabel1 = new javax.swing.JLabel();
        panelListado = new javax.swing.JLayeredPane();
        panelPlayer = new javax.swing.JLayeredPane();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(622, 619));
        setMinimumSize(new java.awt.Dimension(622, 619));
        setPreferredSize(new java.awt.Dimension(622, 619));

        panelListado.setMaximumSize(new java.awt.Dimension(600, 190));
        panelListado.setMinimumSize(new java.awt.Dimension(600, 190));
        panelListado.setPreferredSize(new java.awt.Dimension(600, 190));

        javax.swing.GroupLayout panelListadoLayout = new javax.swing.GroupLayout(panelListado);
        panelListado.setLayout(panelListadoLayout);
        panelListadoLayout.setHorizontalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelListadoLayout.setVerticalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        panelPlayer.setMaximumSize(new java.awt.Dimension(600, 90));
        panelPlayer.setMinimumSize(new java.awt.Dimension(600, 90));

        javax.swing.GroupLayout panelPlayerLayout = new javax.swing.GroupLayout(panelPlayer);
        panelPlayer.setLayout(panelPlayerLayout);
        panelPlayerLayout.setHorizontalGroup(
            panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPlayerLayout.setVerticalGroup(
            panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(panelListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(panelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panelListado;
    private javax.swing.JLayeredPane panelPlayer;
    // End of variables declaration//GEN-END:variables
}
