/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_2ovning;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class Langdhopp {
    
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double x, y;
        
        //Inmatning
        System.out.println("Skriv in längd: ");
        x = sc.nextDouble();
        System.out.println("Skriv in vindstyrkan: ");
        y = sc.nextDouble();
        
        //Utskrift
        if (x > 7.92 && y < 2.0 ) {
            System.out.println("Grattis!");
            
        }
        else {
            System.out.println("Du slog inget rekord");
        }
        
    }//end main

}//end class
