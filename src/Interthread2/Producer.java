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
public class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    

    @Override
    public void run() {
        int i=0;
        while(i<10){
            q.put(i++);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
