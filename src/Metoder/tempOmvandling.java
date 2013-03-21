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
public class tempOmvandling {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double celsius, f;
        
        
        
        System.out.println("Mata in temp i farenheit: ");
        f = sc.nextDouble();
        
        Support hans = new Support();
        
         celsius = hans.tempOmvandling(f);
        System.out.println("Celsius är: " + celsius);
        
        
    }

}
