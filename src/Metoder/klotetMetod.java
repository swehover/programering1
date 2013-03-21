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
public class klotetMetod {
    public static void main(String[] args) {
        double volym, radie;
        Support program = new Support();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vad är volymen? ");
        radie = sc.nextInt();
        
        volym = program.klot(3);
        
        System.out.println("Volymen är: " + volym);
    }

}
