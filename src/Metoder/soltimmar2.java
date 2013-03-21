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
public class soltimmar2 {
    
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Support program = new Support();        
                       
        
        program.soltimmar("Oslo", 6);
        program.soltimmar("Stockholm", 8);
        program.soltimmar("Helsingfors", 8);
        
        char fortsatt;
        
            do {
                System.out.println("Ange en stad: ");
                String stad = sc.next();
                System.out.print("Ange soltimmar: ");
                int soltimmar = sc.nextInt();
                program.soltimmar(stad, soltimmar);
                
                System.out.println("Vill du köra en till beräkning? (J/N)");
                fortsatt = sc.next().charAt(0);
                
               
            } while (fortsatt == 'J' || fortsatt == 'j');
            
            System.out.println("BYE");
        
        
        }  

}



