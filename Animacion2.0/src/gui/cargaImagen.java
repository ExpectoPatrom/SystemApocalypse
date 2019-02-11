/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author estudiantes
 */
public class cargaImagen {
    
    BufferedImage img;
    
    //constructor carga la imagen
    public  cargaImagen(String ruta){
        try {
            img = ImageIO.read(getClass().getResource(ruta));
            System.out.println("Carga exitosa");
        } catch (IOException ex) {
            Logger.getLogger(cargaImagen.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no cargó");
        }
    } 
}
