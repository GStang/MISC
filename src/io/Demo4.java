package io;

import java.io.*;

/**
 * Created by DELL on 2017/3/4.
 * 使用缓冲流写数据到文件中
 */
public class Demo4 {
    public static void main(String[] args) {
        try {
            OutputStream out = new BufferedOutputStream
                    (new FileOutputStream("C:\\Users\\DELL\\Desktop\\test.txt"));
            String str ="abc";
            out.write(str.getBytes());
//            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
