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
public class Prize {
    private int level;
    private int treasures;
    
    public Prize(int l,int t){
        this.level=l;
        this.treasures=t;
    }
    
    public int GetLevel(){
        return level;
    }
    
    public int GetTreasures(){
        return treasures; 
    }
}
