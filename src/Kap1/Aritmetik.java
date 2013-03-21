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
public class Aritmetik {
    
    
    //Deklaration
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
              double x, y, sum, diff, kvot, produkt;
              
              
              //Inmatning
              System.out.print("Skriv ett tal: ");
              x = sc.nextDouble();
              
              System.out.print("Skriv ett tal till: ");
              y = sc.nextDouble();
              sum = x + y;
              diff = x - y;
              kvot = x / y;
              produkt = x * y;
              
              
              //Utskrift
              System.out.println("Summan är: " + sum);
              System.out.println("Differensen är: " + diff);
              System.out.println("Kvoten är: " + kvot);
              System.out.println("Produkten är: " + produkt);
                      
    }//end main
}//end class
