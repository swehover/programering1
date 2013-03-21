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
public class Feber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        System.out.print("Ange din temp: ");
        temp = sc.nextDouble();
        
        if (temp>37.5){
            System.out.println("Du har feber!!! ");
        }
        if (temp<36.0){
            System.out.println("Du mår fan inte bra!!! ");
                    
        }
        else {
            System.out.println("Du är frisk!!!! ");
            
        }
    }//end main


}//end class
