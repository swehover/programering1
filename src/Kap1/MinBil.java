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
public class MinBil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        i = 0;
        
        System.out.println("   ____");
        System.out.println("__/____\\_");
        System.out.println("-O-----O-");
        
        System.out.println("Hur lång bil vill du åka i? ");
        int langBil = sc.nextInt();
        
         System.out.print("   ");
        while ( i < langBil){
            System.out.print("_");
            i++;
        }
        System.out.println("");
        System.out.print("__/");
        
        i = 0;
        while ( i < langBil){
            System.out.print("_");
            i++;
          }
        System.out.print("\\__");
        
        System.out.println("");
        System.out.print("-0-");
        
        i = 0;
        while ( i < langBil){
            System.out.print("-");
            i++;
          }
        System.out.print("-0-");
        
    }

}
