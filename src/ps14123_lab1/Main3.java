/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab1;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Main3 {
     public static void main(String[] args) {
        ArrayList<Product> List2 =new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            NoTaxProduct sp2 = new NoTaxProduct();
            sp2.nhap();
            List2.add(sp2);
            }
          for(Product i: List2) {
             i.xuat();
         }
    }
}
