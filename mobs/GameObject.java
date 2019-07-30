/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myRoguelike.mobs;

import java.awt.Graphics;


public abstract class GameObject {
    
    protected int x, y;
    protected MobID id;
    
    public GameObject(int x, int y, MobID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
    
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    
    public void setID(MobID id) {
        this.id = id;
    }
    public MobID getID() {
        return id;
    }
    
}
