/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab6;


/**
 *
 * @author Acer
 */
public class MainMyThread {
    public static void main(String[] args) {
        MyThread Thread1 = new MyThread(){}; 
        Thread r1 = new Thread(Thread1);
        r1.start();
        r1.setPriority(10);
      
        MyThread Thread2 = new MyThread(){}; 
        Thread r2 = new Thread(Thread2);
        r2.start();
        r2.setPriority(5);
       
    }
}
