/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myRoguelike.driver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;

public class Grid 
{ 
    JFrame frame; 

    
    Grid() 
    { 
        ArrayList<JButton> tileArr = new ArrayList<JButton>();
        
        int gridSize = 75;
        int tileSize = (750/gridSize);
        JButton[][] gridTiles = new JButton[gridSize][gridSize];
        
        // creating instance of JFrame with name "first way" 
        frame = new JFrame("first way");
          
        // creates instance of JButton  
        
        for (int x = 0; x < gridSize; x++) {
            for (int y = 0; y < gridSize; y++) {
                JButton newTile = new JButton();
                newTile.setBounds(tileSize*x+1, tileSize*y+1, tileSize, tileSize);
                gridTiles[x][y] = new JButton();
                frame.add(newTile);
            }
        }
        
//        
//        int n = 0;
//        for (int x = 0; x < 30; x++) {
//            for (int y = 0; y < 30; y++) {
//                tileArr.add(new JButton());
//                tileArr.get(n).setBounds(25*x+1, 25*y+1, 25, 25);
//                frame.add(tileArr.get(n));
//                //System.out.println("(" + x + "," + y + ")");
//                n++;
//            }
//        }

        
        
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