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
public class talMetod {

    public static void main(String[] args) {
        
        double tal1, tal2;
        double minst = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in ett tal: ");
        tal1 = sc.nextDouble();
        
        System.out.println("Skriv in ett till tal: ");
        tal2 = sc.nextDouble();
        
        
        
        
        
        
        
            Support svar = new Support();
            minst = svar.talMetod(tal1, tal2);
        
    
         System.out.println("Minsta talet är: " + minst);
    }
}
