/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap9_1;

import java.util.Arrays;

/**
 *
 * @author Hans Emmoth
 */
public class TestaArrayer { 
    public static void main(String[] args) {
        
        int [] a = { 1, 5 ,9};
        int [] b = { 1, 5, 9};
        
        boolean koll = Arrays.equals(a, b);
        
        if (koll == true) {
            System.out.println("lika");
        } else {
            System.out.println("olika");
        }
    }//End main
    

}//End class
