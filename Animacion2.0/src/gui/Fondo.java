/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.image.BufferedImage;

/**
 *
 * @author nicol
 */
public class Fondo {
    public String ruta;
    public int[][]pixeles;
    public int alto, ancho;
    BufferedImage imagen;
    cargaImagen imagenCargada;
    public Fondo(String ruta){
        imagenCargada = new cargaImagen(ruta);
        imagen = imagenCargada.img;
        alto=imagen.getHeight();
        ancho=imagen.getWidth();
        pixeles = new int[alto][ancho];
        for(int x=0; x<alto;x++){
            for(int y=0; y<ancho; y++){
                pixeles[x][y]=imagen.getRGB(y,x);
            }
        }  
    }
}
