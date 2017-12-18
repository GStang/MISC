package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by DELL on 2017/1/16.
 * RandomAccessFile可以在文件中移动，并且可以修改文件中的某一个值
 */
public class UsingRanddomAccessFile {
    static String file = "rtest.dat";
    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for (int i = 0;i<7;i++) {
            System.out.println("Value" + i + ":" + rf.readDouble());
        }
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        for (int i = 0;i<7;i++) {
            rf.writeDouble(i * 1.414);
        }
        rf.writeUTF("唐光圣");
        rf.close();
        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5 * 8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}
