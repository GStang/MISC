package io;

import java.io.File;

/**
 * Created by DELL on 2017/3/4.
 * 获取一个路径下的所有文件的名称或者文件
 */
public class Demo1 {
    //    private static Component path;
    static File path = new File("C:\\Users\\DELL\\Desktop");

    public static void main(String[] args) {
        String file[] = path.list();
//        path.listFiles()
        for (String name : file) {
            System.out.println(name);
        }
    }
}
