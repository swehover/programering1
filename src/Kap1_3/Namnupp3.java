/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

/**
 *
 * @author Hans Emmoth
 */
public class Namnupp3 {
    public static void main(String[] args) {
        String fnamn = "Hans";
        String enamn = "Emmoth";
        
        System.out.println(fnamn.charAt(0) + "." + enamn.charAt(0));
        
        String helanamnet = "Hasse Emmoth";
        System.out.print(helanamnet.charAt(0) + ".");
        
        for (int i = 0; i < helanamnet.length(); i++) {
            if (helanamnet.charAt(i) == ' ') { 
                System.out.print(helanamnet.charAt(i +1));
            }
            
        }
        System.out.println("");
        
        
    }

}
