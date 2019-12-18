/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mehed
 */
public class MultiThreadMain {
    public static void main(String[] args) {
        new MultiThread("Thread One");
        new MultiThread("Thread Two");
        new MultiThread("Thread Three");
        for(int i=0;i<10;i++){
            System.out.println("Main Thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
//                Logger.getLogger(MultiThreadMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
