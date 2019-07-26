/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import mobs.*;


public class Main {
    
    static boolean gameLoop = true;

    static Main m = new Main();
    static MobCard mb1 = new MobCard("Joel", 10, 5, 19, 2);
    public static void main(String[] args){
        while(gameLoop) {
            System.out.println("Hello World");
            gameLoop = false;
        }
        
        System.out.print(mb1);
}
    
}
