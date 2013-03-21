/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap_15;

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Hans Emmoth
 */
public class StackTest {
    public static void main(String[] args) {
        LinkedList<String> minStack = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        char svar;
        boolean fortsatt = true;
        while (fortsatt) {
            System.out.println("Stack");
            if (minStack.isEmpty()) {
                System.out.println("ingen stack");
            }//End if
            else {
                for (String namn : minStack) {
                    System.out.println(namn + " ");  
                }//End for
            }//End else
        System.out.println("");
        System.out.println("Välj:");
        System.out.println("1. lägg till en tallrik");
        System.out.println("2. vems tallrik ligger högst upp?");
        System.out.println("3. ta bort den översta tallriken");
        System.out.println("0. avsluta programmet");
            
            System.out.println("");
            
            try {
                svar = sc.nextLine().charAt(0);
                switch (svar) {
                    case '1':
                        System.out.println("Vemstallrik?");
                        String namn = sc.nextLine();
                        minStack.push(namn);
                        break;
                    case '2':
                        System.out.println("högst upp är " + minStack.peek() + " tallrik");
                        System.out.println("(tryck ENTER) "); sc.nextLine();
                        break;
                    case '3':
                        System.out.println("tar bort " + minStack.pop() + "tallrik");
                        System.out.println("(tryck ENTER) "); sc.nextLine();
                        break;
                    case '0':
                        fortsatt = false;
                        System.out.println("Slut");
                        break;
                }
            } catch (Exception e) {}
            System.out.println("");
        }//End while
        
    }//End main

}//End class
