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
public class cirkel2 {
    
    public static void main(String[] args) {
        //Deklaration
        double radie, area, omkrets;
        
        Scanner sc = new Scanner(System.in);
        Support program = new Support();
        
        //Inmatning
        System.out.println("Skriv radien: ");
        radie = sc.nextDouble();
        
        program.area(radie);
        program.omkrets(radie);
        
        //Utskrift
        Support svar = new Support();
        area = svar.area(radie);
        
        System.out.println("Arean är: " + area);
        
        Support svar2 = new Support();
        omkrets = svar2.omkrets(radie);
        
        System.out.println("Omkretsen är: " + omkrets);
        
        
        
    }

}
