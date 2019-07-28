/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myRoguelike.driver;
import java.awt.Canvas;
import mobs.*;


public class Game extends Canvas implements Runnable {
    
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    
    private Thread thread;
    private boolean running = false;
    
    public Game() {
        new Window(WIDTH, HEIGHT, "a game", this);
    }
    
    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }
    
    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void run() {
        
    }
    
    public static void main(String[] args){
        new Game();
}
    
}
