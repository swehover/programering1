/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap9_1;

/**
 *
 * @author Hans Emmoth
 */
public class sortera {
  
    public static void main( String[] arg ) {
        int n = 100;
        int[] a = new int[n];
        System.out.print("Dessa tal slumpas till arrayen:");
            for(int i = 0 ; i < n ; i++) {
                if(i%10==0) System.out.println();
                a[i] = (int)( 1000 * Math.random() );
                System.out.print(a[i]+"\t");
                }
                // Här sker sorteringen:
        int s;
            for(int i = 0; i < n-1 ; i++ ) {
                for(int j = i+1; j < n ; j++ ) {
                    if (a[i] > a[j]) { // om a[i] > a[j] byter de plats!
                    s = a[i]; a[i] = a[j]; a[j] = s; // s är slaskvariabel
            }//End if
                }//End for
                    }//End for
            System.out.println();
            System.out.print("Efter sortering:");
                for(int i = 0 ; i < n ; i++) {
                    if(i%10==0) System.out.println();
                    System.out.print(a[i]+"\t");
                }//End for
                    }//End main
                        }//End class

