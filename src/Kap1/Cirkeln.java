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
public class Cirkeln {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double pi, radie = 0, area, omkrets;
        pi = 3.14159;
        
        //Inmatning
        System.out.println("Vad är radien? ");
        radie = sc.nextDouble();
        
        //Utskrift
        System.out.println("Arean är: " + pi * radie * radie);
        System.out.println("Omkretsen är: " + 2 * pi * radie);
        
        
        
        
        
        
    }// end main

}// end class
