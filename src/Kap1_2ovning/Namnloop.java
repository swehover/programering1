/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_2ovning;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class Namnloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namn; 
        
        System.out.println("Skriv ditt namn: ");
        namn = sc.nextLine();
        
        for (int j = 0; j < 10; j++) {
            
            System.out.println("" + namn);
            
        }
        
        
    }
}
