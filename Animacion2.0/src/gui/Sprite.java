/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author estudiantes
 */
public class Sprite{

    public final int ancho;
    public final int alto;
    public int[][] pixeles;
    public Sprite(HojaSprites sprite,int alto, int ancho,int posI, int posJ){
        this.ancho=ancho;
        this.alto=alto;
        pixeles = new int[alto][ancho];
        int barridoI;
        int barridoJ;
        barridoI = posI*alto;
        barridoJ = posJ*ancho;
        for(int i=0; i<this.alto;i++){
            for(int j=0; j<this.ancho;j++){
                if(barridoI<sprite.alto && barridoJ<sprite.ancho){
                    pixeles[i][j]=sprite.pixeles[barridoI][barridoJ];
                     barridoJ++;
                }
            }
            barridoI++;
            barridoJ-= this.ancho;
        }
    }
    
}