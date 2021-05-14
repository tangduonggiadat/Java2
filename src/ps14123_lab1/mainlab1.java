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
public  class  mainlab1 {
    public static void main(String[] args) {
        ArrayList<Product> List =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Product sp = new Product();
            sp.nhap();
            List.add(sp);
            }
         for(Product i: List) {
             i.xuat();
         }
         
    }
}
