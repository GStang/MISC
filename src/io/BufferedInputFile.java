package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by DELL on 2017/1/12.
 * 这个例子说的是从缓冲中输入文件，
 * 意思是，先把一个文件缓冲，然后再输入到控制台
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        //使用BufferedReader类
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String s = BufferedInputFile.read("C:\\Users\\DELL\\Desktop\\test.txt");
        System.out.println(s);
    }
}
