/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Metoder;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class OhmMetod {
    
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double spänning, resistans, ström;
        
        //Inmatning
        System.out.println("Hur stor är resistansen?:");
        resistans = sc.nextDouble();
        
        System.out.println("Hur stor är strömmen?:");
        ström = sc.nextDouble();
        
                      
        Support program = new Support();
        
        spänning = program.ohm(resistans,ström);
        
        //Utskrift
        System.out.println("Spännigen är: " + spänning);
                
        
    }

}
