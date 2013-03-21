/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap_15;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class HaschTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> ht = new HashMap<>();
        ht.put("Danmark", "köpenhamn");
        ht.put("Sverige", "Stockholm");
        ht.put("Norge", "Oslo");
        ht.put("Ryssland", "Moskva");
        ht.put("Tyskland", "Berlin");
        ht.put("Finland", "Helsingfors");
        ht.put("Frankrike", "Paris");
        System.out.println("Land? ");
        String land = sc.nextLine();
        
        while (!land.equals("#")) {
            System.out.println("Huvudstad: " + ht.get(land));
            System.out.println("Land? ");
            land = sc.nextLine();
            
        }//End while
        System.out.println("Slut");
    }//End main

}//End class
