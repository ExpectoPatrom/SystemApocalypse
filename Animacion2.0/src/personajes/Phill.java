/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import gui.HojaSprites;
import gui.Sprite;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author nicol
 */
public class Phill implements KeyListener{
    
    int teclaPresionada;
    public int x;
    public int y; 
    int dx,dy,esp,frente,der,izq;
    HojaSprites phillJobs;
    public Sprite Phill_1;
    public Sprite Phill_2;
    public Sprite Phill_3;
    public Sprite Phill_4;
    public Sprite Phill_5;
    public Sprite Phill_6;
    public Sprite Phill_7;
    public Sprite Phill_8;
    public Sprite Phill_9;
    public Sprite Phill_10;
    public Sprite Phill_11;
    public Sprite Phill_12;
    public Sprite Phill_13;
    public Sprite Phill_14;
    public Sprite Phill_15;
    public Sprite Phill_16;
    public Sprite PhillDelMomento;//es la imagen que resulta enviandose al lienzo
    public Sprite[] PhillFrente;
    
    @SuppressWarnings("empty-statement")
    public Phill(){
        teclaPresionada = 0;
        x=0;y=0;dx=0;dy=0;
        frente=0;
        esp=0;
        izq=0;
        der=0;        
        phillJobs = new HojaSprites("../RECURSOS/SpriteSheet.png");
        Phill_1 = new Sprite(phillJobs,52,36,0,0);
        Phill_2 = new Sprite(phillJobs,52,36,0,1);
        Phill_3 = new Sprite(phillJobs,52,36,0,2);
        Phill_4 = new Sprite(phillJobs,52,36,0,3);
        Phill_5 = new Sprite(phillJobs,52,36,1,0);
        Phill_6 = new Sprite(phillJobs,52,36,1,1);
        Phill_7 = new Sprite(phillJobs,52,36,1,2);
        Phill_8 = new Sprite(phillJobs,52,36,1,3);
        Phill_9 = new Sprite(phillJobs,52,36,2,0);
        Phill_10 = new Sprite(phillJobs,52,36,2,1);
        Phill_11 = new Sprite(phillJobs,52,36,2,2);
        Phill_12 = new Sprite(phillJobs,52,36,2,3);
        Phill_13 = new Sprite(phillJobs,52,36,3,0);
        Phill_14 = new Sprite(phillJobs,52,36,3,1);
        Phill_15 = new Sprite(phillJobs,52,36,3,2);
        Phill_16 = new Sprite(phillJobs,52,36,3,3);
        PhillDelMomento = Phill_1;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclaPresionada = e.getKeyCode();
        
        if(teclaPresionada == KeyEvent.VK_W && y>1){
            if(y==5)System.out.println("No puedes subir más, estás en el borde se la pantalla");
            dy-=5;
            //el Switch elige una sprite para la animacion, y lo actualiza para enviarselo al lienzo
            switch(esp){
                case 0:
                    PhillDelMomento = Phill_13;
                    esp++;
                    break;
                case 1:
                    PhillDelMomento = Phill_14;
                    esp++;
                    break;
                case 2:
                    PhillDelMomento = Phill_15;
                    esp++;
                    break;
                case 3:
                    PhillDelMomento = Phill_16;
                    esp=0;
                    break;
            }
            actualizar();
        }
        if(teclaPresionada == KeyEvent.VK_S && y<799){
            if(y==795)System.out.println("No puedes bajar más, estás en el borde se la pantalla");
            dy+=5;
            switch(frente){
                case 0:
                    PhillDelMomento = Phill_1;
                    frente++;
                    break;
                case 1:
                    PhillDelMomento = Phill_2;
                    frente++;
                    break;
                case 2:
                    PhillDelMomento = Phill_3;
                    frente++;
                    break;
                case 3:
                    PhillDelMomento = Phill_4;
                    frente=0;
                    break;
            }
            actualizar();
            
        }
        if(teclaPresionada == KeyEvent.VK_A && x>=2){
            if(x==5)System.out.println("No puedes desplazarte hacia la izquierda, estás en el borde se la pantalla");
            dx-=5;
            switch(izq){
                case 0:
                    PhillDelMomento = Phill_5;
                    izq++;
                    break;
                case 1:
                    PhillDelMomento = Phill_6;
                    izq++;
                    break;
                case 2:
                    PhillDelMomento = Phill_7;
                    izq++;
                    break;
                case 3:
                    PhillDelMomento = Phill_8;
                    izq=0;
                    break;
            }
            actualizar();
            
        }
        if(teclaPresionada == KeyEvent.VK_D && x<=798){
            if(x==795)System.out.println("No puedes desplazarte hacia la derecha, estás en el borde se la pantalla");
            dx+=5;
            switch(der){
                case 0:
                    PhillDelMomento = Phill_9;
                    der++;
                    break;
                case 1:
                    PhillDelMomento = Phill_10;
                    der++;
                    break;
                case 2:
                    PhillDelMomento = Phill_11;
                    der++;
                    break;
                case 3:
                    PhillDelMomento = Phill_12;
                    der=0;
                    break;
            }
            actualizar();
            
        }
    }
    public void actualizar(){
        x = x +dx;
        y = y + dy;
        dy = 0;
        dx = 0;        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
