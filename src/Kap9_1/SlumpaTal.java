/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap9_1;

/**
 *
 * @author Hans Emmoth
 */
public class SlumpaTal {
    public static void main(String[] args) {
        int n = 100;
        int [] a = new int [n];
        
        
        for (int i = 0; i < n; i++) {
            if (i%10==0) {
                System.out.println("");
                a[i] = (int)(1000 * Math.random());
                System.out.println(a[i] +"\t");
             }
        }
    
    
   }//End main
}//End class
