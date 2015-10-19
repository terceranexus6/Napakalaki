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
public class PruebaNapakalakijava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prize p=new Prize(2,3);
        
        System.out.println("el num..niveles....es "+p.GetLevel());
        System.out.println("el num...tesoros....es "+p.GetTreasures());
        
        //monstruo de prueba
        Prize prueba2 = new Prize(2,3);
        BadConsequence prueba3 = new BadConsequence("es muy malo",1,2,3);
        Monster prueba = new Monster("feucho", 7, prueba2, prueba3);
        
        System.out.println("el nivel del monstruo es : "+ prueba.GetCombatLevel());
        System.out.println("el nombre del monstruo es: "+ prueba.GetName());
        
    }
    
}
