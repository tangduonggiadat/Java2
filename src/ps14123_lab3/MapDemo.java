/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author Acer
 */
public class MapDemo {
    public static void main(String[] args) {
         Map<String, Student> map = new HashMap<>();
    Student sv1 = new Student();
    sv1.ten = "Tuấn";
    sv1.nganh = "CNTT";
    sv1.diem = 7.0;
    Student sv2 = new Student();
    sv2.ten = "Tú";
    sv2.nganh = "Design";
    sv2.diem = 5.0;
    Student sv3 = new Student();
    sv3.ten = "Thúy";
    sv3.nganh = "QTKD";
    sv3.diem = 9.0;
    map.put(sv1.ten, sv1);
    map.put(sv2.ten, sv2);
    map.put(sv3.ten, sv3);
    Set<String> keys = map.keySet();
for(String name : keys){
Student sv = map.get(name);
System.out.println(">Họ và tên: " + sv.ten);
    System.out.println(">Điểm:" +sv.diem);
System.out.println(">Học lực: " + sv.getHocluc());
    System.out.println("\n");
    }
}
}
