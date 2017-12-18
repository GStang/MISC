package io;

import java.io.*;

/**
 * Created by DELL on 2017/1/15.
 * output类及其子类都是向外输出东西，
 * 记得在输出完成之后需要关闭掉输出流
 *
 * 在记事本中，默认的编码是gbk，
 * 但是在通常的IDE中，默认的编码是utf-8
 * 因此要解决中文乱码的问题，就需要把输入输出流的
 * 编码修改为gbk
 *
 * 文件内容的读取，通常是返回到一个byte数组中，
 * 然后根据不同的编码方式，把byte数组转换为字符串
 *
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\DELL\\Desktop\\test.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)));
        dataOutputStream.writeUTF("唐光圣");
        dataOutputStream.close();

        DataInputStream dataInputStream = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)
                )
        );
        byte[] bytes = new byte[100];
        dataInputStream.read(bytes);
        String s = new String(bytes);
        System.out.println(s);

//        System.out.println(bytes);
//        System.out.println(dataInputStream.read(bytes));
//        try {
//            OutputStreamWriter writer = new OutputStreamWriter(
//                    new FileOutputStream("C:\\Users\\DELL\\Desktop\\test.txt"),"gbk"
//            );
//            writer.write("唐光圣");
//            writer.append("TGS");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//    o1 = new DataOutputStream();
//    String str = "abcde";
//    byte[] s = new byte[20];
//    System.out.println(str);
//    s = str.getBytes();
//    try {
//        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\DELL\\Desktop\\test.txt"));
//        stream.write(s);
//        stream.close();
//        stream.flush();
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }

    }
}
