package io;

import java.io.*;

/**
 * Created by DELL on 2017/1/16.
 * 使用DataOutputStream写入数据，我们就可以使用DataOutputStream准确得读取数据
 *
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("Data.txt")
                )
        );
        out.writeDouble(3.1415926);
        out.writeUTF("唐光圣");
        out.writeDouble(1.41413);
        out.writeUTF("厉害了");
        out.close();
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("Data.txt")
                )
        );
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());

    }
}
