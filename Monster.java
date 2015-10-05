/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalakijava;

/**
 *
 * @author pauladelahoz
 */
public class Monster {
    private String name;
    private int combatLevel;
    
    public String GetName(){
        return name;
    }
    
    public int GetCombatLevel(){
        return combatLevel;
    }
    
    public Monster(String n, int cl){
        this.name=n;
        this.combatLevel=cl;
    }
    

    
}
