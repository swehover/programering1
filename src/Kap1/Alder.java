/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author Hasse Emmoth
 */
public class Alder {
    
    public static void main(String[] args) {
        //Deklaration
        int alder;
        Scanner sc = new Scanner(System.in);
        
        //Inmatning
        System.out.println("Ange din ålder: ");
        alder = sc.nextInt();
        
        //alder = alder + 1;
        alder++;
        
        System.out.println("Nästa gång fyller du: " + alder);
        
    }//end main
    
   
}//end class
