package io;

import java.io.*;

/**
 * Created by DELL on 2017/1/16.
 * 这是一个工具类，用来读取二进制的文件。
 *  拥有两个重载方法，一个方法的参数是文件名，
 *  另一个参数的方法是一个字符串
 */
public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(
                new FileInputStream(bFile)
        );
        try {
            byte[] data = new byte[bf.available()];
            bf.read(data);
            return data;
        } finally {
            bf.close();
        }
    }

    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile).getAbsoluteFile());
    }
}
