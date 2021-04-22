/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicola.cristian
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
      
        
   
        
        
     try {
        FileOutputStream FO= new FileOutputStream("test.ser");
        ObjectOutputStream OS = new ObjectOutputStream(FO);
        OS.flush();
        OS.close();
        FO.close();
        FileInputStream FI= new FileInputStream("test.ser");
        ObjectInputStream IS= new ObjectInputStream(FI);
        
        GeneratoreStudenti gs = new GeneratoreStudenti();
        
        Thread t = new Thread(gs);
        t.start();
     
        
        
         } catch (FileNotFoundException ex) {
            System.out.println("Imposssibile trovare il file");
        } catch (IOException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
