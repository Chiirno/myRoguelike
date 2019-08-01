/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myRoguelike.driver;

import java.awt.*;
import javax.swing.*;



public class Tile extends JPanel
{
    
    private String ID;
    public int tileSize;
    public int tileLocX;
    public int tileLocY;
    
    public Tile(int tileSize, int tileLocX, int tileLocY) {
        this.tileSize = tileSize;
        this.tileLocX = tileLocX;
        this.tileLocY = tileLocY;
}
    
    JFrame tile = new JFrame(ID);

    
    public void paintTile(Graphics g) {
        g.drawRect(tileSize, tileSize, tileLocX, tileLocY);
    }
    
    
} 