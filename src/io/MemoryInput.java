package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by DELL on 2017/1/12
 * 这个例子是关于从内存中输入，
 * 意思是将一个文件读入到内存中，
 * 然后再向控制台输入
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
//        StringReader in2 = new StringReader()
        StringReader in = new StringReader(BufferedInputFile.read("C:\\Users\\DELL\\Desktop\\test.txt"));
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
