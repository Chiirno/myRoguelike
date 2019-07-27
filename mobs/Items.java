/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobs;

/**
 *
 * @author Furrytrash
 */
public class Items {
    
    private int hp, mp, att, def;
    private String name, desc;
    
    public Items(String name, int healthMod, int manaMod, int attMod, int defMod
            ,String desc ){
        
        this.name = name;
        hp = healthMod;
        mp = manaMod;
        att = attMod;
        def = defMod;
        this.desc = desc;
    }
    public Items(String name, int attMod, int manaMod, String desc){
        
        this.name = name;
        att = attMod;
        mp = manaMod;
        this.desc = desc;
    }
    
    // ------------------ Setters ----------------- //
    private void setName(String a){
        name = a;
    }
    
    private void setHealth(int a){
        hp = a;
    }
    private void setMana(int a){
        mp = a;
    }
    
    private void setAtt(int a){
        att = a;
    }
    
    private void setDef(int a){
        def = a;
    }
    
    private void setDesc(String a){
        desc = a;
    }
    
    // ----------------- Getters --------------------- //
    
    private String getName(){
        return name;
    }
    private String getDesc(){
        return desc;
    }
    private int getHealth(){
        return hp;
    }
    private int getMana(){
        return mp;
    }
    private int getDef(){
        return def;
    }
    private int getAtt(){
        return att;
    }
            
    protected String returnItems(){
        return toString();
    }
            
//    public Items(){
//        
//    }
//    public Items(){
//        
//    }
//    public Items(){
//        
//    }
    
    
    
    @Override
    public String toString(){
        return ("\nName: " + getName() + "\nModifiers: " + "HP + " + getHealth() 
                + ", MP + " + getMana() + ", Att + " + getAtt() + ", Def + "
                + getDef() + "\nDescription: " + getDesc() + "\n");
    }
    
    private static Items a = new Items("Suzy", 4, 3, 5, 1, "Joel's cousin Suzy");
    private static Items b = new Items("Joel", 20, -20, "Joel's lazy");
    
    public static void main(String[] args){
        
        System.out.print(a);
        System.out.print(b);
        
    }
}
