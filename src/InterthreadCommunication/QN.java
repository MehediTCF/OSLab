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
public class QN {
    int n;
    synchronized int get(){
        
        System.out.println("Got: "+n);
        return n;
        
    }
    
    synchronized void put(int n){
        this.n = n;
        System.out.println("Put: "+n);
    }
}
