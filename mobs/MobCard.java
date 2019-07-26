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
public class MobCard {

    private int hp, mp, att, def;
    private String name;
    
    public MobCard(String name, int hp, int mp, int att, int def) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.att = att;
        this.def = def;

    }
// ------------------ Setters --------------------//
    private void setHealth(int a) {
        hp = a;
    }

    private void setMana(int a) {
        mp = a;
    }

    private void setDef(int a) {
        def = a;
    }

    private void setAtt(int a) {
        att = a;
    }

    private void setName(String a){
        name = a;
    }
    
// ------------------------ Getters ------------------------------//
    private String getName(){
        return name;
    }
    
    private int getHealth(){
        return hp;
    }
    
    private int getMana(){
        return mp;
    }
    
    private int getAtt(){
        return att;
    }
    
    private int getDef(){
        return def;
    }
    
    
    @Override
    public String toString() {
        return ("Name: " + getName() + "\nHP: " + getHealth() 
                + "\nMP: " + getMana() + "\nAttack: " +
                getAtt() + "\nDef: " + getDef() + "\n");  
    }
}
