/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap9_1;

/**
 *
 * @author Hans Emmoth
 */
public class Summa_medel_max_min {
    public static void main(String[] args) {
        int n = 100;
        int [] a = new int[n];
        
        System.out.println("Dessa tal  slumpas till arrayern");
        for (int i = 0; i < n; i++) {
            if (i%10==0) System.out.println("");
            {
                a[i] = (int)(1000*Math.random());
                System.out.println(a[i]+"\t");
                   
                 int summa, max, min;
                double medel;
                summa =0;
                min = 1000;
                max = -1;
               
            }//End if
        }//End for
        
          int summa, max, min;
                double medel;
                summa =0;
                min = 1000;
                max = -1;
                
                for (int i = 0; i < n; i++) {
            summa = summa + a[i];
                    if (a[i] > max) {
                        max = a[i];
                    }
                    if (a[i] < min) {
                        min = a[i];
                    }
        }
                
                medel = (double) summa/n;
                System.out.println("");
                System.out.println("summa= " + summa);
                System.out.println("max= " + max);
                System.out.println("min= " +min);
                System.out.println("medel= " + medel);
    }//End main
}//End class
