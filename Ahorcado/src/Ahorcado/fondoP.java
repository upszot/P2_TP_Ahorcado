/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author upszot
 */

    public class fondoP implements Border
    {

        BufferedImage fondo;

        public fondoP()
        {
            try
            {
               // URL url = new URL(getClass().getResource("\\Imagenes\\fondo.jpg").toString());
                fondo = ImageIO.read(new File("fondo800x700-02.png"));
            }
            catch (IOException ex)
            {
                Logger.getLogger(fondoP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
        {
            g.drawImage(fondo, (x + (width - fondo.getWidth()) / 2), (y + (height - fondo.getHeight()) / 2), null);
        }

        public Insets getBorderInsets(Component c)
        {
            return new Insets(0, 0, 0, 0);
        }

        public boolean isBorderOpaque()
        {
            return true;
        }
    }