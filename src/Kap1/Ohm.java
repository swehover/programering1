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
public class Ohm {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double r, i, u;
        char fortsatt;
        
        do {
            
        
        //Inmatning
        System.out.println("Hur stor är strömmen? ");
        i = sc.nextDouble();
        
        System.out.println("Hur stor är resistansen? ");
        r = sc.nextDouble();
        
        //Utskrift
        System.out.println("spänningen är: " + i * r);
        
        System.out.println("Ny beräkning?  J/N ");
            fortsatt=sc.next().charAt(0);
         
        } while (fortsatt =='J' || fortsatt == 'j');
        
    }// end main

}// end class
