/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab7;

import ps14123_lab7.PolyStudent.Career;

/**
 *
 * @author Acer
 */
public class MainPoly {
    public static void main(String[] args) {
    PolyStudent sv = new PolyStudent();
    sv.fullname = "Nguyễn Văn Tèo";
    sv.career = Career.UDPM;
    sv.career = Career.valueOf("UDPM");
    sv.print();
}
    }

