/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

/**
 *
 * @author Hans Emmoth
 */
public class StringTest {
    public static void main(String[] args) {
        String namn ="Hasse";
        String namn2 ="Hasse^";
        
        boolean okej =namn.equals(namn2);
        System.out.println("" + okej);
        
        if (namn.equals (namn2)) {
            System.out.println("Bra där"); 
        }
        else    {
            System.out.println("SYND");
        }
    }//End main

}//End class
