/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterthreadCommunication;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mehed
 */
public class Q {
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted!");
//                Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Got: "+n);
        valueSet = false;
        notify();
        return n;
   
    }
    
    synchronized void put(int n){
        while (valueSet) { 
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted");
//                Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            
        }
            this.n = n;
            valueSet = true;
            System.out.println("Put: "+n);
            notify();

   }
}
