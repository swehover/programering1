/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_2ovning;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class Cirkel {
    
    public static void main(String[] args) {
        
          //Deklaration
        Scanner sc = new Scanner(System.in);
        double pi, radie = 0, area, omkrets;
        pi = 3.14159;
        char fortsatt;
        
        do {
            
            
        
        //Inmatning
        System.out.println("Vad är radien? ");
        radie = sc.nextDouble();
        
        //Utskrift
        System.out.println("Arean är: " + pi * radie * radie);
        System.out.println("Omkretsen är: " + 2 * pi * radie);
        
        System.out.println("Ny beräkning?  J/N ");
            fortsatt=sc.next().charAt(0);
         
        } while (fortsatt =='J' || fortsatt == 'j');
        
        System.out.println("Hej då");
        
        
        
        
        
        
    }// end main

}// end class
