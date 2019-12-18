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
public class NewThreadExtends extends Thread {

    public NewThreadExtends() {
        super("Child Thread");
        start();
        
    }
    


    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child Thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error!");
//                Logger.getLogger(NewThreadExtends.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Child Thread Exits");
        
    }
    
    

}
