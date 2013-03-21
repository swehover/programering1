/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */

public class BytaTeckenupp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        StringBuilder hemligtord = new StringBuilder("?????");
        System.out.println(hemligtord.toString());
        
        for (int i = 0; i < hemligtord.length(); i++) {
            System.out.println("Skriv en bokstav: ");
            char tecken = sc.next().charAt(0);
            hemligtord.setCharAt(i, tecken);
            System.out.println(hemligtord.toString());
            
        }               
        
    }//End main

}//End class
