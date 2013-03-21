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
public class Summera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int x, y, summa;
        
        System.out.println("Skriv ett tal: ");
        x = sc.nextInt();
        
        System.out.println("Skriv ett tal: ");
        y = sc.nextInt();
        summa = x + y;
        
        
        System.out.println("Summan är: " + summa);
    }//end main
    
}//end class
