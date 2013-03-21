/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_2ovning;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Hans Emmoth
 */
public class Skivor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int skivor;
        DecimalFormat d = new DecimalFormat("0.##");
        String formateratTal;
        
        
       
        
        
        
        
        System.out.println("En skiva kostar 9,90 kr");
        System.out.println("Vid köp av 10 och upåt blir de 5 % rabbat");
        System.out.println("Vid köp av 50 och upåt blir de 10 % rabbat");
        System.out.println("Vid köp av mer än 100 och över blir det 15 % rabbat");
        
        System.out.println("Hur många skivor? ");
        skivor = sc.nextInt();
        double skivPris;
            skivPris = skivor * 9.90;
            formateratTal = d.format(skivPris);
        
        
        
        if (skivor >= 100) { 
            skivPris = skivPris * 0.85;
            formateratTal = d.format(skivPris);
            System.out.println("Summan är: " + formateratTal);
            
        }
        
        else if (skivor >= 50) {     
            skivPris = skivPris * 0.9;
              formateratTal = d.format(skivPris);          
            System.out.println("Summan är: " + formateratTal);
        }
        
         else if (skivor >= 10) {
             skivPris = skivPris * 0.95;
                formateratTal = d.format(skivPris);    
            System.out.println("Summan är: " + formateratTal);
        }
         else {
             formateratTal = d.format(skivPris);
            System.out.println("Summan är : " + formateratTal);
         }
             
    }//end main

}//end class
