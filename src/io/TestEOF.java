package io;

import java.io.*;

/**
 * Created by DELL on 2017/1/15.
 * 这个例子是输入byte数组到文件中
 * 输入输出流的构造函数特别的奇怪，一个嵌套一个的
 *
 */
public class TestEOF {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("C:\\Users\\DELL\\Desktop\\test.txt")
                    )
            );
            try {
                while (in.available() != 0) {
                    System.out.println(in.readByte());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
