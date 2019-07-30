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
  
    Grid() 
    { 
        ArrayList<JButton> tileArr = new ArrayList<JButton>();
        
        // creating instance of JFrame with name "first way" 
        frame = new JFrame("first way");
          
        // creates instance of JButton  
        
        int n = 0;
        while (n < 3) {
            tileArr.add(new JButton("" + n));
            tileArr.get(n).setBounds(50*n, 50*n, 50, 50);
            frame.add(tileArr.get(n));
            n++;
        }
        
        
        System.out.println(tileArr);
        
//        buttonx.setBounds(100, 100, 50, 50);
//        frame.add(buttonx);

        
          
        // setting close operation 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        // adds button in JFrame 
  
        // sets 500 width and 600 height 
        frame.setSize(800, 800); 
          
        // uses no layout managers 
        frame.setLayout(null); 
          
        // makes the frame visible 
        frame.setVisible(true); 
    } 
      
} 