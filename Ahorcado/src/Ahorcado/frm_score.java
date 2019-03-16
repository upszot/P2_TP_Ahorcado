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
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author upszot
 */
public class frm_score extends javax.swing.JInternalFrame
{

    private Ganador unGanador;
    private Score listaGanadore = new Score();
    private JLabel[] lblGanadores;

    /**
     * Creates new form frm_score
     */
    public frm_score()
    {
        
        this.listaGanadore = Score.cargarScore(Ahorcado.main.pathScore);
        this.lblGanadores = new JLabel[this.listaGanadore.CantidadMostrar];
        //String fondo="fondo2.jpg";
        String fondo="agujero-vidrio_01.jpg";
        
        this.setContentPane(new JLabel(new ImageIcon(fondo)));
        initComponents();
        mostrar_Ganadores();

    }

    private void mostrar_Ganadores()
    {// aca va el for con el tostring para mostrar un ganador en los label.. que se va moviendo tipo titulo
        {
            Container cp = this.panelListado;
            GridLayout gl = new GridLayout(1, this.listaGanadore.CantidadMostrar);
            gl.setHgap(2);
            gl.setVgap(2);
            cp.setLayout(gl);

            for (int i = 0; i < this.listaGanadore.CantidadMostrar; i++)
            {
                this.lblGanadores[i] = new JLabel();
                cp.add(this.lblGanadores[i]);
                this.lblGanadores[i].setText(this.listaGanadore.getListaGanadores().get(i).toString());
                this.lblGanadores[i].setForeground(new Color(255, 255, 255));
                this.lblGanadores[i].setVisible(true);

            }

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

        jLabel1.setText("jLabel1");

        setClosable(true);

        javax.swing.GroupLayout panelListadoLayout = new javax.swing.GroupLayout(panelListado);
        panelListado.setLayout(panelListadoLayout);
        panelListadoLayout.setHorizontalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        panelListadoLayout.setVerticalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(panelListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(panelListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panelListado;
    // End of variables declaration//GEN-END:variables
}
