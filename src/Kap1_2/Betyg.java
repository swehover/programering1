/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class Betyg {
    public static void main(String[] args) {
        
        //Deklaration
            Scanner sc = new Scanner(System.in);
            int poang;
            
            //Inmatning
            System.out.println("Skriv in poäng: ");
            poang = sc.nextInt();
            
            //Utskrift
            if ( poang >= 90 ) 
            { 
                System.out.println("MVG!!");
            }//End if 
            else if ( poang >= 75 ) 
            { 
                System.out.println("VG!!");
            }//End if else
            else if ( poang >= 50) 
            { 
                System.out.println("Godkänd!!");
            }//End if else 2
            else
            {
                System.out.println("Underkänd!!!!!");
            }//End else
            
    }//end main

}//end class
