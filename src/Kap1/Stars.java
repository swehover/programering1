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
public class Stars {
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        //int antalstars = sc.nextInt();
        int i = 0;
        
        //loop
        while ( i < 5 ){
            System.out.println("*");
            i++;
         }
        System.out.println("**********");
        
        System.out.println("How many stars? ");
        int antalstars = sc.nextInt();
        
        
        int s;
        s = 0;
        while (s < antalstars){
            System.out.print("*");
            s++;
        }
        
        
        
        
        
                
        
        
    }//end main 

}//end class
