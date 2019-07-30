/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myRoguelike.driver;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Grid 
{ 
    JFrame frame; 
  
    static int indexGetter(int x, int y) {
        return 15*x + y;
    }
    
    Grid() 
    { 
        ArrayList<JButton> tileArr = new ArrayList<JButton>();
        
        // creating instance of JFrame with name "first way" 
        frame = new JFrame("first way");
          
        // creates instance of JButton  
        
        
        int n = 0;
        for (int x = 0; x < 15; x++) {
            for (int y = 0; y < 15; y++) {
                tileArr.add(new JButton());
                tileArr.get(n).setBounds(50*x+1, 50*y+1, 50, 50);
                frame.add(tileArr.get(n));
                System.out.println("(" + x + "," + y + ")");
                n++;
            }
        }
        
        tileArr.get(indexGetter(0,0)).setBackground(Color.RED);
        
        
//        buttonx.setBounds(100, 100, 50, 50);
//        frame.add(buttonx);

        
          
        // setting close operation 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        // adds button in JFrame 
  
        // sets 500 width and 600 height 
        frame.setSize(769, 791); 
          
        // uses no layout managers 
        frame.setLayout(null); 
          
        // makes the frame visible 
        frame.setVisible(true); 
    } 
      
} 