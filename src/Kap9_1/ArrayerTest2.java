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
public class ArrayerTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                
        String [] a = new String [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Skriv in namn nummer " + i + ":");
            a[i] = sc.nextLine();
        }
        
        System.out.println("du matade in dessa tal: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("namn nummer: " +a[i]);
        }
        System.out.println("baklänges!");
        for (int i = 4; i >= 0; i--) {
            System.out.println("namn nummer: " +a[i]);
        }
    }

}
