/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interthread2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mehed
 */
public class Q {
    int n;
    boolean value = false;
    synchronized int get()
    {
        while (!value) {            
            try {
                wait();
            } catch (InterruptedException ex) {
//                Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Got: "+n);
        value = false;
        notify();
        return n;
        
        
     
    }
    synchronized void put(int n){
        
        {
            while (value) {                
                try {
                    wait();
                } catch (InterruptedException ex) {
//                    Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.n = n;
        value = true;
        System.out.println("Put: "+n);
        notify();
    }
}
