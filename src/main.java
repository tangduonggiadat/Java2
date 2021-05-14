
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class main {
    public static void main(String[] args) {
        ArrayList<ontap> diavi = new ArrayList<>();
        for (int i=0;i<2;i++) {
            ontap tv = new ontap();
            tv.nhap();
            diavi.add(tv);
            tv.xuat();
        }
    }
}
