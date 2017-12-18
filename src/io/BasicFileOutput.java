package io;

import java.io.*;

/**
 * Created by DELL on 2017/1/15.
 * 这个程序是用来读取文件中的信息，
 * 然后写入到另外一个文件中。
 *
 */
public class BasicFileOutput {
    static String file = "C:\\Users\\DELL\\Desktop\\test.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("C:\\Users\\DELL\\Desktop\\test2.txt")
                )
        );
//        PrintWriter out = new PrintWriter(new BufferedWriter(
//                new FileWriter(file)
//        ));
        PrintWriter out = new PrintWriter(file);

        int lineCount = 1;
        String s;
//        s = in.readLine();
        while ((s = in.readLine() )!= null) {
            out.println(lineCount++ + ":" + s);
//            System.out.println(out.println(lineCount++ + ":" + s));
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));

    }
}
