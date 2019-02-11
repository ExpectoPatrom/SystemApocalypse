/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.util.TimerTask;
import javax.swing.JPanel;
import java.util.Timer;
import personajes.Phill;

/**
 *
 * @author nicol
 */
public final class Lienzo extends JPanel{
        
    BufferedImage imagenLienzo;
    HojaSprites phillJobs;
    Phill phillColection;
    Timer timer;    
    Fondo fondo;
    public Lienzo(){
        setVisible(true);
        fondo = new Fondo("../RECURSOS/pequeña.png");
        phillColection = new Phill();
        imagenLienzo = new BufferedImage(1000,800,BufferedImage.TYPE_INT_RGB);  
        imagenLienzo = actualizarImagen(phillColection.PhillDelMomento, imagenLienzo,1,1,fondo);
        timer = new Timer();
        timer.schedule(new tarea(),0,40);
    }
    
    
    public BufferedImage actualizarImagen(Sprite SpriteADibujar, BufferedImage imagenLienzo,int x,int y,Fondo fondo){
        int pixelesSprite[][] = SpriteADibujar.pixeles;
        int pixelesFondo[][] = fondo.pixeles;
        for(int i=0; i<fondo.alto ;i++){
            for(int j=0; j<fondo.ancho; j++){
                imagenLienzo.setRGB(j, i,pixelesFondo[i][j]);
            }
        }
        for(int i=0; i<SpriteADibujar.alto ;i++){
            for(int j=0; j<SpriteADibujar.ancho; j++){
                if(pixelesSprite[i][j]!= 000){
                    imagenLienzo.setRGB(j+x, i+y, pixelesSprite[i][j]);
                }
                
            }
        }
        return imagenLienzo;
    }
    @Override
    public void paint(Graphics g){        
        super.paint(g);        
        Graphics2D g2d = (Graphics2D)g;
        imagenLienzo = actualizarImagen(phillColection.PhillDelMomento, imagenLienzo,phillColection.x,phillColection.y,fondo);
        g2d.drawImage(imagenLienzo, 0, 0, null);
        g.dispose();
    }
    public void ActionPerformed(ActionEvent e){
        phillColection.actualizar();
        repaint();
    }
    private class tarea extends TimerTask{

        @Override
        public void run() {
            repaint();
        }
    
    }
}
