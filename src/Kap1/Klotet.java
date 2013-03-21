/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class Klotet {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double pi, r, v;
        pi = 3.14159;
        
        //Inmatning
        System.out.println("Vad är radien? ");
        r = sc.nextDouble();
        
        //Utskrift
        System.out.println("Klotets volym är: " + 4 * pi * r * r * r /3);
                    
        
    }// end main    

}// end class
