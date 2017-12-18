package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by DELL on 2017/3/4.
 * 读取文件中的内容
 */
public class Demo2 {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:\\Users\\DELL\\Desktop\\test.txt");
            byte[] b=new byte[100];
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
