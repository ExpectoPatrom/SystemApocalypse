/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class Principal extends JFrame{
    Dimension dimension = new Dimension(1000,800);
    Lienzo lienzo;    
    
    public void Principal(){
        iniciar();
    }
    public void iniciar(){        
        lienzo = new Lienzo();       
        setVisible(true);
        setLocationRelativeTo(null);
        //setLocationRelativeTo();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        add(lienzo);
        pack();
        setSize(dimension);
        lienzo.setBounds(0, 0, 800, 800);
        addKeyListener(lienzo.phillColection);          
    }
    
//    public void actionPerformed(ActionEvent e){
//        lienzo.phillColection.actualizar();
//        System.out.println("aaa");
//        System.out.println("CALLED");
//        lienzo.repaint();
//    }
}
