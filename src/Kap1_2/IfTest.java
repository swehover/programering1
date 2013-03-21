/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class IfTest {
    public static void main(String[] args) {
        
        int x, y;
        Scanner sc = new Scanner(System.in);
                System.out.print("Skriv in x: ");
                x=sc.nextInt();
                System.out.print("Skriv in y: ");
                y=sc.nextInt();
                
        if (x > 0 && y > 0)
        {   System.out.print("Båda är posetiva! ");   }
        else if (x > 0 || y > 0)
        {   System.out.print("Ett tal är posetivt!!!!");  }
        else 
                { System.out.println("Du suger -.-"); }
                
            
                  
                
        
    }//End main

}//End class
