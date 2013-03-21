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
public class langdhopp2 {
    public static void main(String[] args) {
        double vind, längd;
        
        Support program = new Support();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hur långt hoppade du?");
        längd = sc.nextDouble();
        System.out.println("Hur stark är vinden?");
        vind = sc.nextDouble();
      
        boolean result = program.langdhopp(vind, längd);
       
       
        if ( result == true) {
            System.out.println("Du har nytt rekord!!!");
        }
        
        else    {
            System.out.println("Du suger!!!!");
        }
        
        
        
    }

}
