/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterthreadCommunication;

/**
 *
 * @author mehed
 */
public class ConsumerN implements Runnable{
    QN q;

    public ConsumerN(QN q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            q.get();
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
