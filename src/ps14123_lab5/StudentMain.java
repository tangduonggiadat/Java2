/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class StudentMain{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
     List<Student> list = new ArrayList<>();
   list.add(new Student("Tuấn", 5, "CNTT"));
   list.add(new Student("Cường", 7.5, "TKTW"));
   list.add(new Student("Hạnh", 8.5, "CNTT"));
   
   XFile.writeObject("C:/JV2/students.dat", list);
     List<Student> list2 = (List<Student>) XFile.readObject("C:/JV2/students.dat");
        for (Student sv : list) {
            System.out.println("Họ tên:"+sv.ten);
            System.out.println("Điểm:"+sv.diem);
            System.out.println("Ngành:"+sv.nganh);
            System.out.println("Xếp loại:"+sv.getGrade());
            System.out.println("Thưởng:"+sv.isBonus());
            System.out.println("\n");
        }
   }
}
