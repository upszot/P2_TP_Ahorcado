/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.awt.Color;
import java.awt.Container;

import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author upszot
 */
public class JIlFrm_juego extends javax.swing.JInternalFrame
{

    Teclado tecladoEnPantalla;
    Juego nuevoJuego;

    /**
     * Creates new form NewJInternalFrame
     */
    public JIlFrm_juego()
    {
        initComponents();
        showTeclado();
        iniciarJuego();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPalabra = new javax.swing.JTable();
        lblIngreseLetra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPalabra = new javax.swing.JLabel();
        panelTeclado = new javax.swing.JLayeredPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLayeredPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLayeredPane1ComponentShown(evt);
            }
        });

        jtPalabra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtPalabra);

        lblIngreseLetra.setText("Ingrese Letra:");

        lblPalabra.setText("jLabel1");

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblIngreseLetra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPalabra, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblIngreseLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngreseLetra)
                .addGap(7, 7, 7))
        );

        panelTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelTecladoLayout = new javax.swing.GroupLayout(panelTeclado);
        panelTeclado.setLayout(panelTecladoLayout);
        panelTecladoLayout.setHorizontalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTecladoLayout.setVerticalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTeclado)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLayeredPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLayeredPane1ComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_jLayeredPane1ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPalabra;
    private javax.swing.JLabel lblIngreseLetra;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLayeredPane panelTeclado;
    // End of variables declaration//GEN-END:variables

//------------- METODOS
    private void iniciarJuego()
    {
        DefaultTableModel tb = new DefaultTableModel(new Object[]{"ini"},5);
        nuevoJuego = new Juego();
        tb.addRow(new String[]{"1","2"});

        System.out.println("letras" + this.nuevoJuego.getPalabra_a_buscar().getPalabra().length());
        for (int i = 0; i < this.nuevoJuego.getPalabra_a_buscar().getPalabra().length(); i++)
        {
            tb.addColumn(i);
            //this.lblPalabra.addTe("___");
        }
        jtPalabra = new JTable(tb);

       jtPalabra.setBackground(new Color(10, 10, 10));
       jtPalabra.setVisible(true);
    }

    private void showTeclado()
    {
        Container cp = panelTeclado;
        GridLayout gl = new GridLayout(1, 1);
        cp.setLayout(gl);

        tecladoEnPantalla = new Teclado();
        cp.add(tecladoEnPantalla);
        tecladoEnPantalla.setVisible(true);
    }

}
