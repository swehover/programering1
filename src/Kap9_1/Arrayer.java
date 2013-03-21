/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap9_1;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class Arrayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Skriv in nummer " + i + ":");
            a[i] = sc.nextInt();
        }
        
        System.out.println("du matade in dessa tal: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("tal nummer: " +a[i]);
        }
        System.out.println("baklänges!");
        for (int i = 4; i >= 0; i--) {
            System.out.println("tal nummer: " +a[i]);
        }
    }//End main
}//End class

