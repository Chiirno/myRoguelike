/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobs;

import java.util.ArrayList;

/**
 *
 * @author Furrytrash
 */
public class Inventory{
    
    private static ArrayList<Items> item;
    private static ArrayList<Items> test = new ArrayList<>();
    private static Inventory ah = new Inventory(test);
    
    public Inventory(ArrayList<Items> items){
        super();
        item = items;
    }
    
    private static Items a = new Items("Suzy", 4, 3, 5, 1, "Joel's cousin Suzy");
    private static Items b = new Items("Joel", 20, -20, "Joel's lazy");
    
    private static void displayInventory(){
        for (int i = 0; i < item.size()-1; i++){
           ah.test.get(i).toString();
        }
    }
    
    public static void main(String[] args){
        
        test.add(a);
        test.add(b);
        displayInventory();
    }
}
