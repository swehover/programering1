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
public class Loop {
    
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        String fnamn;
        int n;
        //Inmatning
        System.out.println("Skriv ditt namn: ");
        fnamn = sc.next();
        System.out.println("Hur många varv??");
        n = sc.nextInt();
        int i = 0;
        
        while (i < n){
            System.out.println("Du heter " + fnamn);
            i++;
            
        }
        System.out.println("---Nu är lopen slut!---");
        
        
    }//end main
}// end class
