/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Metoder;

/**
 *
 * @author Hans Emmoth
 */
public class Support {

    public void mess(){
        //String mess = "Hej från metod";
        int tal = 90;
        int tal2 = 60;
        int svar = tal + tal2;
        System.out.println("Svaret är: " + svar);
        
    }//End mess
    

    public double tempOmvandling(double f) {

        double celsius = (f - 32) / 1.8;

        return celsius;
        
    }//End tempomvandling
    
     public double talMetod(double tal1, double tal2)  {

        double minst;
        
          if (tal1 < tal2 ) {
            minst = tal1;
            
        }
        
        else {
            minst = tal2;
        }
        
        
      return minst;  
        
    }//End Talmetod
    
     
     public void soltimmar(String stad, int soltimmar) {
         
        
         System.out.print("" + stad);
         System.out.print(":");
        
         for (int i = 0; i < soltimmar ; i++) {
             System.out.print("*");
             
                  
         }
         System.out.println("");
     }//End soltimmar
     
     public double omkrets(double radien) {
         double omkrets;
         
         omkrets = 2 * Math.PI * radien;         
                  
         return omkrets;
         
        
     }//End omkrets
     
     public double area(double radien) {
         double area;
         
         area = Math.PI * radien * radien;
                     
         return area;
         
     }//End area
     
     public double pi() {
         
         return 3.14159265;

     }//End pi
     public boolean langdhopp(double vind, double längd) {
         
         boolean result;
        
         if (vind < 2.0 && längd > 7.92) {
             result = true; 
         }
         
         else {
             result = false;
         } 
            
        return result;
     }//End langdhopp
     
     public double ohm(double resistans, double ström) {
       double spänning;
       
         spänning = resistans * ström;
         
         
         return spänning;
         
     }//End spännig
     
    public double klot(double radie) {
        double volym;
        
        volym = 4 * radie * radie * radie * Math.PI /3;
        
        
        return volym;
    }//End klot
    
    public double skivor (int antal)  {
        double skivpris, slutpris;
        skivpris = 9.90;
        
        if (antal >= 100) {
         slutpris = skivpris * antal * 0.85;            
         
        }
        
        else if (antal >= 50)  {
            slutpris = skivpris * antal * 0.9;
            
        }
        
        else if (antal >= 10)  {
            slutpris = skivpris * antal * 0.95;
                        
        }
        
        else    {
            slutpris = skivpris * antal;
        }
        
        return slutpris;
    }

}//End calss