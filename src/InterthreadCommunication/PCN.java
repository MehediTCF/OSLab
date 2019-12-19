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
public class PCN {
    public static void main(String[] args) {
        QN q = new QN();
        new ProducerN(q);
        new ConsumerN(q);
        
    }
}
