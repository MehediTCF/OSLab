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
public class MultiThreadJoin implements Runnable{
    String name;
    Thread t;

    public MultiThreadJoin(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: "+t.getName());
        t.start();
        
    }
    

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(name+" :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(name+": Error ");
            }
        }
        System.out.println(name+": Exiting");
    }
    
}
