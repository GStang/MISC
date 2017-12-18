package io;

import java.io.PrintWriter;

/**
 * Created by DELL on 2017/1/17.
 * 这个例子是把System.out转换为PrintWrite
 *
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello World");
    }
}
