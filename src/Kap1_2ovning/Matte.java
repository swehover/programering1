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
public class Matte {
    
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        int tal1, tal2, sum, kvot, diff, prod;
        char r, fortsatt;
        
        do {
            
    

        //Inmatning
        System.out.println("Skriv in ett tal: ");
        tal1 = sc.nextInt();
        System.out.println("Skriv in ett tal: ");
        tal2 = sc.nextInt();
        System.out.println("Välj ett räknesätt: +,-,/,*");
        r = sc.next().charAt(0);
        
        
        
         switch (r) {
            case '+':
                sum = tal1 + tal2;
                System.out.println("Summan är: " + sum);
                break;

            case '-':
                diff = tal1 - tal2;
                System.out.println("Differansen är: " + diff);
                break;

            case '/':
                kvot = tal1 / tal2;
                System.out.println("Kvoten är: " + kvot);
                break;

            case '*':
                prod = tal1 * tal2;
                System.out.println("Produkten är: " + prod);
                break;
                
         }
         System.out.println("Ny beräkning?  J/N ");
            fortsatt=sc.next().charAt(0);
         
        } while (fortsatt =='J' || fortsatt == 'j');
        
        
               
                       
        
    }//end main
         
    }//end class


