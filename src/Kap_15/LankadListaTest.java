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
public class LankadListaTest {
    
    public static void main(String[] args) {
        
        ArrayList<String> namnlista = new ArrayList<String>();
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
        System.out.println("1. Fyll listan med namn");
        System.out.println("2. Lägg till ett namn");
        System.out.println("3. Lägg till namn på viss plats");
        System.out.println("4. Se element nummer...");
        System.out.println("5. Ta bort element nummer...");
        System.out.println("6. Ta bort ett namn");
        System.out.println("7. Ta bort alla");
        System.out.println("0. Avsluta");
        
            try{
            svar = sc.nextLine().charAt(0);
            switch (svar){
                
            case '1':
                namnlista.add("Kalle"); namnlista.add("Lisa");
                namnlista.add("Anna"); namnlista.add("Johan");
                namnlista.add("Stina"); namnlista.add("Pelle");
                break;
                
            case '2':
                System.out.print("Skriv ett namn: ");
                namn = sc.nextLine();
                if (!namn.equals("")) namnlista.add(namn);
                break;
                
            case '3':
                System.out.print("Ange namnet: ");
                namn = sc.nextLine();
                System.out.print("Ange plats: ");
                nr = Integer.parseInt(sc.nextLine());
                if (!namn.equals("")) namnlista.add(nr,namn);
                break;
                
            case '4':
                System.out.print("Skriv ett nummer: ");
                nr = Integer.parseInt(sc.nextLine());
                System.out.print("På denna plats finns " + namnlista.get(nr));
                System.out.print("(Tryck ENTER)"); sc.nextLine();
                break;
                
            case '5':
                System.out.println("Vilken plats vill du rensa?");
                plats = sc.nextInt();                
                namnlista.remove(plats);                
                break;
                
            case '6':
                System.out.println("Ange namnet du vill ta bort");                   
                        namn = sc.nextLine();
                        boolean hittad = false;
                    if (!namn.equals("")){
                         for (String namnetIListan : namnlista) {
                             if (namnetIListan.equals(namn)) {
                                   namnlista.remove(namn);
                                   hittad = true;
                             }//End if                           
                         }//End for
                    }else {
                        System.out.println("Du måste ange ett namn från listan");
                    }
                
                break;
                
            case '7':
                System.out.println("Val nr 7");
                namnlista.clear();
                break;
                
            case '0':
                fortsatt = false;
                System.out.println("SLUT");
                break;
                
            } // end of switch
            } catch(Exception e){}
            System.out.println();
            } // end of while
        
    }//End main
}//End class
