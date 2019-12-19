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
public class CallMe {
        synchronized void call(String message){
        System.out.println(""+message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error!");
        }
        System.out.println("End");
    }
}
