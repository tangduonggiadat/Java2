
import java.math.BigDecimal;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class ontap {
    String ten;
    int tuoi;
    double luong;
    
   void nhap(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
        System.out.println("Nhập tên:");
        ten= sc.nextLine();
        System.out.println("Nhập tuổi:");
        tuoi=sc.nextInt();
        System.out.println("Nhập lương:");
        luong =sc.nextDouble();
        sc.nextLine();
       }
    }
     void xuat(){
         for (int i = 0; i < 2; i++) {
        System.out.println(ten+" "+tuoi+" "+luong);
         }
    }
}
