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
    boolean flag = false;
    Container cp;

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
        this.lblGanadores = new JLabel[this.listaGanadore.CantidadMostrar + 4];

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
        flag = true;
        cp.removeAll();        
        mostrar_Ganadores();

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
          cp = this.panelListado;

            //  this.panelListado.setMaximumSize(new Dimension(600, 190));
            //   this.panelPlayer.setMaximumSize(new Dimension(600, 90));
            GridLayout gl = new GridLayout(this.listaGanadore.CantidadMostrar + 4, 1);
            gl.setHgap(8);
            gl.setVgap(8);
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

            if (flag)
            {
                 cp.add( new JLabel());
                 cp.add( new JLabel());
                
                JLabel ultimoGanador = new JLabel();
                ultimoGanador.setFont(new Font("Tahoma", 1, 30));
                ultimoGanador.setVerticalAlignment((int) CENTER_ALIGNMENT);
                ultimoGanador.setHorizontalAlignment((int) CENTER_ALIGNMENT);
                ultimoGanador.setText(this.unGanador.toString());

//            ultimoGanador.setText(this.listaGanadore.getListaGanadores().get(0).toString());
                ultimoGanador.setForeground(new Color(255, 255, 255));
                cp.add(ultimoGanador);
                ultimoGanador.setVisible(true);

            }

        }
    }

    /*  private void mostrar_UltimoGanador()
    {// muestra el ultimo jugar que anoto
        {
            Container cp = this.panelPlayer;
            GridLayout gl = new GridLayout(1, 1);
            gl.setHgap(20);
            gl.setVgap(10);
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
    }*/
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
        panelListado = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(622, 619));
        setMinimumSize(new java.awt.Dimension(622, 619));
        setPreferredSize(new java.awt.Dimension(622, 619));

        panelListado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelListado.setMaximumSize(new java.awt.Dimension(370, 328));
        panelListado.setMinimumSize(new java.awt.Dimension(370, 328));
        panelListado.setOpaque(false);
        panelListado.setPreferredSize(new java.awt.Dimension(370, 328));

        javax.swing.GroupLayout panelListadoLayout = new javax.swing.GroupLayout(panelListado);
        panelListado.setLayout(panelListadoLayout);
        panelListadoLayout.setHorizontalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        panelListadoLayout.setVerticalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(panelListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(panelListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelListado;
    // End of variables declaration//GEN-END:variables
}
