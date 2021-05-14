/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class TestThread {
    public static void main(String[] args) {
        OddThread ot = new OddThread();
        ot.start();
        try {
            ot.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        EvenThread et = new EvenThread();
        et.start();
    }
    
}
