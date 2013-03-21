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
public class NamnLoop2 {
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        String namn; 
        int antal;
        
        System.out.println("Skriv ditt namn: ");
        namn = sc.nextLine();
        
        System.out.println("Hur många gånger vill du skriva ut ditt namn? ");
        antal = sc.nextInt();
        
        
        for (int j = 0; j < antal; j++) {
            System.out.println("" + namn);
        }
        
            
        }
        
    }


