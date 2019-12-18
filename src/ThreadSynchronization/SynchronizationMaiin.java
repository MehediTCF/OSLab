/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadSynchronization;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mehed
 */
public class SynchronizationMaiin {
    public static void main(String[] args) {
        CallMe callme = new CallMe();
        Caller ob1 = new Caller(callme, "Hello");
        Caller ob2 = new Caller(callme, "Crazy");
        Caller ob3 = new Caller(callme, "People");
        
//        try {
//            ob1.t.join();
//            ob2.t.join();
//            ob3.t.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(SynchronizationMaiin.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
