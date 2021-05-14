/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Lab8Bai2 {
   
   
    public static void main(String[] args) {
      ArrayList<Integer> myarr = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
      
        for (int i = 0; i < 10; i++) {
            System.out.printf("Nhập số thứ %d:",i+1);
            int a= sc.nextInt();
            myarr.add(a);
        }
        System.out.println("KQ:\n");
        for (Integer integer : myarr) {
            System.out.printf(integer+"\t");
        }
        
    }
}
