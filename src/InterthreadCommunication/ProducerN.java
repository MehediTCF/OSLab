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
public class ProducerN implements Runnable{
    QN q;

    public ProducerN(QN q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    

    @Override
    public void run() {
        int i=0;
        while(true){
            q.put(i++);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
