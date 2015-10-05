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
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures; 
    private boolean death; 
    
    public BadConsequence(String s, int le, int n, int h){
        this.text=s;
        this.levels=le;
        this.nVisibleTreasures=n;
        this.nHiddenTreasures=h;
        this.death=false;
    }
    
    public BadConsequence(String st, boolean de){
        this.text=st;
        this.death=de;
        this.nVisibleTreasures=0;
        this.nHiddenTreasures=0;
        this.levels=0;
    }
    
        public String GetText(){
        return text;
    }
    
    public int GetLevels(){
        return levels;
    }
    
    public int GetnVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int GetnHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public boolean GetDeath(){
        return death;
    }
        private ArrayList<TreasureKind>specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind>specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(String te, int lev, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
       this.text=text; 
       this.levels=lev;
       this.specificHiddenTreasures=tHidden;
       this.specificVisibleTreasures=tVisible;
       this.death=false;
       this.nVisibleTreasures=0;
       this.nHiddenTreasures=0;
    }
    
    public String toString(){
        
        return "text= "+text+" levels= "+Integer.toString(levels)+"death: "+Boolean.toString(death)+"nVisibleTreasures= "+Integer.toString(nVisibleTreasures)+"nHiddenTreasures= "+Integer.toString(nHiddenTreasures);
    }
}
