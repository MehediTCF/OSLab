/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interthread2;

/**
 *
 * @author mehed
 */
public class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q =q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while(true){
            q.get();
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
