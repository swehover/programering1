/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Hans Emmoth
 */
public class GlassKon {
    
    public static void main(String[] args) {
        
        LinkedList<String> namnlista = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        String namn;
        int plats;
        int nr;
        char svar;
        boolean fortsatt = true;;
        while(fortsatt){
            System.out.print("Länkad lista: ");
                if (namnlista.isEmpty()) System.out.print("Listan är tom");
                else{
                    for(int i = 0; i < namnlista.size(); i++)
                    System.out.print( i + "." + namnlista.get(i) + " " );
                    }
        
                System.out.println();
                System.out.println("Välj:");
                System.out.println("1. Lägg till ny person");
                System.out.println("2. Vem är först i kön?");
                System.out.println("3. Ta bort person");
                System.out.println("0. Avsluta");
        
            try{
            svar = sc.nextLine().charAt(0);
            switch (svar){
                
            case '1':
                System.out.print("Skriv ett namn: ");
                namn = sc.nextLine();
                if (!namn.equals("")) namnlista.addLast(namn);
                break;
                
            case '2':
               String forst = namnlista.getFirst();
                System.out.println(forst + "är först i kön");
                break;
                
            case '3':
                namnlista.removeFirst();
                break;
                                
            case '0':
                fortsatt = false;
                System.out.println("SLUT");
                break;
                
            } // end of switch
            } catch(Exception e){}
            System.out.println();
            }//End while
            } // end main
        
    }//End class

