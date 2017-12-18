package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by DELL on 2017/3/4.
 * 使用字节流写内容到文件中去
 */
public class Demo3 {
    public static void main(String[] args) {
        try {
            OutputStream out = new FileOutputStream("C:\\Users\\DELL\\Desktop\\test.txt");
            String str = "唐光圣";
            byte[] bytes = str.getBytes();
            out.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
