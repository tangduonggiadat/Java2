/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14123_lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class XFile {
    Path path = Paths.get("C:\\JV2\\a.gif");
    public static byte[] Read(String path){
        FileInputStream fis;
        try {
            byte[] data;
          fis=  new FileInputStream(path);
           int n =fis.available();
           data = new byte[n];
           fis.read();
           fis.close();
           return data;
            }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void write(String path,byte[] data){
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
      }
    }
    public static Object readObject(String path) throws ClassNotFoundException{
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object ob=  ois.readObject();
            ois.close();
            return ob;
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }
    public static void writeObject(String path, Object ob) throws IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(ob);
            oos.close();
        } catch (FileNotFoundException e) {
              throw new RuntimeException(e);
        }
    }
}
