/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadSynchronization;

/**
 *
 * @author mehed
 */
public class Caller implements Runnable{
    String message;
    CallMe callme;
    Thread t;

    public Caller(CallMe callMe, String Message) {
        callme = callMe;
        message = Message;
        t = new Thread(this);
        t.start();
    }
    
    

    @Override
    public void run() {
        {
        callme.call(message);

    }
    
}
}