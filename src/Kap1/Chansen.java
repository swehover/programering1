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
public class Chansen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        
        System.out.print("välj alternativ (A/B): ");
        c = sc.next().charAt(0);
        System.out.println("Du skrev tecknet: " + c);
        
        if (c == 'A'){
            System.out.println("Grattis du vann en lyxkryssning!!!");
        }
        else{
            System.out.println("Nitlott");
                  
        }
            
        
        
        
        
    }//end main 
}//end class
