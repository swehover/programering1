/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap_15;


import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class HashTest2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Hashtable<String,String> ht = new Hashtable<>();
        char svar;
        int antalratt = 0;
                while (true) {
            
        
            System.out.println("");
            System.out.println("Välj:");
            System.out.println("1. Skapa en hashtabell");
            System.out.println("2. Sök huvudstad");
            System.out.println("3. Tabellens innehåll");
            System.out.println("4. Geografiförhör");
            System.out.println("0. avsluta");
        
        try {
            svar = sc.nextLine().charAt(0);
            switch (svar) {
                case '1':                   
                    ht.put("Danmark", "Köpenhamn");
                    ht.put("Sverige", "Stockholm");
                    ht.put("Norge", "Oslo");
                    ht.put("Världenscentrum", "Hofors");
                    ht.put("Ryssland", "Moskva");
                    ht.put("Tyskland", "Berlin");
                    ht.put("Finland", "Helsingfors");
                    ht.put("Frankrike", "Paris");
                    System.out.println("Klart!");
                    break;
                case '2':
                    System.out.println("Land? ");
                    String land = sc.nextLine();
                    System.out.println("Huvudstad: " + ht.get(land));
                    break;
                case '3':
                    for (String nyckel : ht.keySet()){
                        System.out.print(nyckel + ": ");
                        System.out.println(ht.get(nyckel));
                     }
                    break;
               case '4':
                        for (String nyckel : ht.keySet()){
                        System.out.print("Vad heter huvudstaden i " + nyckel + "? ");
                        String svaret = sc.nextLine();
                            if (svaret.equals(ht.get(nyckel))) {
                                System.out.println("Rätt");
                                antalratt ++;
                            } else {
                                System.out.println("fel, rätt svar är " + ht.get(nyckel));
                            }
                            
                        }
                        System.out.println("Du fick " + antalratt + "rätt");
                        break;
                 case '0':
                        System.out.println("SLUT");
                 default:
                        break;
                     
                        
            }//End switch
        }//End try
        catch (Exception e) {    }
        }//End while
                
                
        
    }//End main

}//End class
