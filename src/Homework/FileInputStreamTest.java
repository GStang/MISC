package Homework;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by DELL on 2016/11/8.
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        byte a[] = "welcome".getBytes();
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write(a);
            out.close();
            FileInputStream in = new FileInputStream(file);
            int n = 0;
           // if ((n = in.read(a)) != -1){
            //    System.out.println(n);
                in.read();
                System.out.println(in.read(a));
           // }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
