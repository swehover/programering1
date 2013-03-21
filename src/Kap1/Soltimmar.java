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
public class Soltimmar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Support program = new Support();
        
        
        System.out.println("Hur många timmar sol har Stockholm? ");
        int antalSolTimmarIStockholm = sc.nextInt();
        
        System.out.print("S:");
        
        int i =0;
        while (i < antalSolTimmarIStockholm) {
            System.out.print("*");
            i++;
        }
        System.out.println("Hur många timmar sol har Oslo? ");
        int antalSolTimmarIOslo = sc.nextInt();
        
        System.out.print("O:");
        
        int r;
        r = 0;
        while (r < antalSolTimmarIOslo) {
            System.out.print("*");
            r++;
        }
        System.out.println("Hur många timmar sol har Helsingfors? ");
        int antalSolTimmarIHelsingfors = sc.nextInt();
        
        System.out.print("H:");
        
        int p;
        p = 0;
        while (p < antalSolTimmarIHelsingfors) {
            System.out.print("*");
            p++;
        }
        
        
    }

}
