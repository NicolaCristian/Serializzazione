/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicola.cristian
 */
public class GeneratoreStudenti implements Runnable {
    String[]nomi = {"Cristian","Fabio","Samuele","Chiara","Davide"};
    String[]cognomi = {"Nicola","Manduca","Miele","Rossi","Martini"};
    
   
    

    @Override
    public void run() {

     while(true){   
         try {
             Studente s = getStudente();
             System.out.println(s.getAll());
             
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             Logger.getLogger(GeneratoreStudenti.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     }
    }
    
    
    
    
      public Studente getStudente(){

        Studente s = new Studente(nomi[(int)(Math.random()*nomi.length)],
                cognomi[(int) (Math.random()*nomi.length)],
                (int) (Math.random()*30));
     
        return s;
    }
      
}
