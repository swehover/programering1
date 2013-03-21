/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Metoder;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class skivorMetod {
    public static void main(String[] args) {
        double slutpris;
        int antal;
        Support program = new Support();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Antal skivor du önskar köpa: ");
        antal = sc.nextInt();
        
       slutpris = program.skivor(antal);
        
        
        System.out.println("priset blev: " + slutpris);
    }

}
