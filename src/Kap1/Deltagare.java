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
public class Deltagare {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        int n;
        
        //Inmatning
        System.out.println("Hur många deltagare? ");
        n = sc.nextInt();
        
        //utskrift
        if ( n < 12 ){
            System.out.println("OK");
        }
        
        else {
            System.out.println("Förmånga! ");
        }
        
    }// end main

}// end class
