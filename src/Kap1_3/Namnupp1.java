/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

/**
 *
 * @author Hans Emmoth
 */
public class Namnupp1 {
    public static void main(String[] args) {
        String namn = "Das Hasse";
        
        for (int i = namn.length()-1; i >= 0; i--) {
            System.out.println(namn.charAt(i));
        }
    }

}
