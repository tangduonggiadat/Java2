/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Product {
 String name;
 double price;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getImportTax(){
      return price*0.1 ;
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên:");
        name = sc.nextLine();
        System.out.println("Nhập giá:");
        price = sc.nextDouble();
        sc.nextLine();
    }
    void xuat(){
            System.out.println(name+" "+price+" "+getImportTax());
    }
    
}
