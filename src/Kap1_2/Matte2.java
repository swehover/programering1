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
public class Matte2 {
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double tal1, tal2, sum, kvot, prod, dif;
        char r;
        
        //Inmatning
        System.out.println("Skriv in ett tal: ");
        tal1 = sc.nextInt();
        System.out.println("Skriv in ett till tal: ");
        tal2 = sc.nextInt();
        System.out.println("Välj räknesätt: +,-,/,* ");
        r = sc.next().charAt(0);
        
        //Switch 
        switch (r) {
            case '+':
                sum = tal1 + tal2;
                System.out.println("summan är: " + sum);
                break;
            case '-':
                dif = tal1 - tal2;
                System.out.println("Differansen är: " + dif);
                break;
            case '/':
                kvot = tal1 / tal2;
                System.out.println("Kvoten är: " +kvot);
                break;
            case '*':
                prod = tal1 * tal2;
                System.out.println("Produkten är: " + prod);
                break;
                
            default:
                System.out.println("Du suger du kan inte ens räkna");
        }
            
    }

}
