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
public class Gloslista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        int antalratt = 0;
        int antalfel = 0;
        char svar;
        boolean fortsatt = true;
        
        
        
        while (fortsatt) {
                    
            System.out.println("");
            System.out.println("Välj:");
            System.out.println("1. Skapa en gloslista");
            System.out.println("2. Visa gloslista");
            System.out.println("3. Skriv in en ny glosa");
            System.out.println("4. glostest");
            System.out.println("0. avsluta");
        
            try {
                svar = sc.nextLine().charAt(0);
                switch (svar) {
                    case '1':
                        System.out.println("");
                        hm.put("måne", "moon");
                        hm.put("bil", "car");                        
                        hm.put("boll", "ball");
                        hm.put("regn", "rain");
                        hm.put("sol", "sun");
                        hm.put("johan", "okej"); 
                                
                                
                        
                        System.out.println("Listan är fylld!");
                        break;
                    case '2':
                        for (String nyckel : hm.keySet()){
                        System.out.print(nyckel + ": ");
                        System.out.println(hm.get(nyckel));
                     }
                        break;
                    case '3':
                        System.out.println("Skriv in glosan på svenska: ");
                       String glosasv = sc.next();
                        System.out.println("Skriv in glosan på engelska: ");
                        String glosaeng = sc.next();
                        
                        hm.put(glosasv, glosaeng);
                        break;
                    case '4':
                        for (String nyckel : hm.keySet()){
                        System.out.print("Vad är det engelska ordet för " + nyckel + "? ");
                        String svaret = sc.nextLine();
                        svaret.equalsIgnoreCase(svaret);
                            if (svaret.equals(hm.get(nyckel))) {
                                System.out.println("Rätt");
                                antalratt ++;
                            } else {
                                System.out.println("fel, rätt svar är " + hm.get(nyckel));
                                antalfel ++;
                            }
                            
                        }
                        
                        if (hm.size() == antalratt) {
                            System.out.println("DU FICK ALLA RÄTT OMG");
                        } else {
                          System.out.println("Du fick " + antalratt + " rätt, av " + hm.size() + " möjliga");
                            System.out.println("Och du fick " + antalfel + " fel");
                        }
                        break;
                    case '0':
                    fortsatt = false;
                        System.out.println("SLUT!");
                    default:
                        
                }
            } catch (Exception e) {
            }
            
            }//End while
    }//End main
}//End class
