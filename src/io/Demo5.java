package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by DELL on 2017/3/4.
 */
public class Demo5 {
    public static void main(String[] args) {
        try {
            Writer out = new FileWriter("C:\\Users\\DELL\\Desktop\\test.txt");
            out.write("唐光圣");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
