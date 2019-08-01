
package myRoguelike.graphics;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Grid 
{ 
    JFrame frame;
    public static JButton[][] gridTiles;
    public Grid() 
    {
        // Variable initializations //
        int gridSize = 10;
        int tileSize = (750/gridSize);
        JButton[][] gridTiles = new JButton[gridSize][gridSize];
        
        // creating instance of JFrame with name "first way" 
        frame = new JFrame("myRoguelike");
          
        
        // Creating the tileset //
        for (int x = 0; x < gridSize; x++) {
            for (int y = 0; y < gridSize; y++) {
                JButton newTile = new JButton();
                newTile.setBounds(tileSize*x+1, tileSize*y+1, tileSize, tileSize);
                gridTiles[x][y] = newTile;
                frame.add(newTile);
            }
        }
        
        Tile newTile = new Tile(50, 50, 50);
        
        // Making the window //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets close op
        frame.setSize(769, 791); // Sets window size
        frame.setLayout(null); // uses no layout managers 
        frame.setVisible(true); // makes the frame visible   
        

    } 
} 