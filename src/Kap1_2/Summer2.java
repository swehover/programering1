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
public class Summer2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x, y ,s;
        char fortsatt;
        
        do {
            System.out.println("Skriv in ett tal: ");
            x = sc.nextInt();
            System.out.println("Skriv in ett tal till: ");
            y = sc.nextInt();
            s = y + x;
            System.out.println("Summan är: " + s);
            System.out.println("Ny beräkning?  J/N ");
            fortsatt=sc.next().charAt(0);
            
            
        } while (fortsatt =='J' || fortsatt == 'j');
        
        
    }//End main

}//End class
