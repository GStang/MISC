package io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by DELL on 2017/1/15.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read
                    ("C:\\Users\\DELL\\Desktop\\test.txt").getBytes()));
            while (true)
                System.out.println(in.readByte());
        } catch (EOFException e) {
            System.err.println(e);
        }
//        DataInputStream in2 = new DataInputStream()
    }
}
