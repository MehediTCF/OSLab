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
public class NewThread implements Runnable{
    
    Thread t;
    NewThread(){
        t = new Thread(this, "Child Thread");
        System.out.println("Thread Name: "+t);
        t.start();
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child Thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error!");
            }
        }
        System.out.println("Child Thread Exits");
    }
    
    
    
}
