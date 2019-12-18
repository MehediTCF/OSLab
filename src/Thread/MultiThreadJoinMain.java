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
public class MultiThreadJoinMain {
    public static void main(String[] args) {
        MultiThreadJoin ob1 = new MultiThreadJoin("One");
        MultiThreadJoin ob2 = new MultiThreadJoin("Two");
        MultiThreadJoin ob3 = new MultiThreadJoin("Three");
        System.out.println("One: "+ob1.t.isAlive());
        System.out.println("Two: "+ob2.t.isAlive());
        System.out.println("Three: "+ob3.t.isAlive());
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Error!");
        }
        System.out.println("One: "+ob1.t.isAlive());
        System.out.println("Two: "+ob2.t.isAlive());
        System.out.println("Three: "+ob3.t.isAlive());
        
    }
    
}
