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
public class NoTaxProduct extends Product{
    double importTax;

    public NoTaxProduct() {
    }

    public NoTaxProduct(double importTax) {
        this.importTax = importTax;
    }
   @Override
    public double getImportTax(){
        return 0;
    }
    public void setImportTax(double importTax) {
        this.importTax = importTax;
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
         if ("VanHoa".equals(name)||"Giaoduc".equals(name)) {
                System.out.println(name+" "+price+" "+super.getImportTax());
        }else{
               System.out.println(name+" "+price+" "+getImportTax());
         }
    }
}
  
