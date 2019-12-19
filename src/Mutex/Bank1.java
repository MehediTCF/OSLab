/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mutex;

/**
 *
 * @author mehed
 */
public class Bank1 extends Thread{
    int t;

    public Bank1(int t) {
       this.t =t;
       start();
        
    }

    @Override
    public void run() {
        if(this.t ==1){
            for(int i=0;i<5;i++)
            {
                while (ThreadSync1.mutex==1) {                    
                    
                }
                ThreadSync1.mutex=1;
                execution();
            }
            
            
    }
        else {
            for(int i=0;i<5;i++)
            {
                while (ThreadSync1.mutex==1) {                    
                    
                }
                ThreadSync1.mutex=1;
//                System.out.println("Yo");
                execution();
            }
        }
    
    
    
}

    synchronized public void execution() {
        if(this.t == 1){
            ThreadSync1.balance = ThreadSync1.balance+1000;
            System.out.println("Thread: "+this.t+" "+ThreadSync1.balance);
            ThreadSync1.mutex=0;
        }
        else {
                        ThreadSync1.balance = ThreadSync1.balance-1000;
            System.out.println("Thread: "+this.t+" "+ThreadSync1.balance);
            ThreadSync1.mutex=0;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}