/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab5;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Student implements Serializable{
   public String ten;
   public double diem;
   public String nganh;

    public Student(String ten, double diem, String nganh) {
        this.ten = ten;
        this.diem = diem;
        this.nganh = nganh;
    }
    
    public String getGrade(){
        if(this.diem < 3){
         return "Kém";
        }
        if(this.diem < 5){
         return "Yếu";
        }
        if(this.diem < 6.5){
         return "Trung bình";
        }
        if(this.diem < 7.5){
         return "Khá";
        }
        if(this.diem < 9){
         return "Giỏi";
        }
         return "Xuất sắc";
        }
    public boolean isBonus(){
         return this.diem >= 7.5;
    }

}
