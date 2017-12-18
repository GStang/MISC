package Homework;

import sun.applet.Main;

/**
 * Created by DELL on 2016/12/19.
 */
public class Demo {
    public static void main(String[] args) {
//        String ad= "agjhgfhj";
//        String[] b = a.split("g");
        Square square1 = new Square(2);
        square1.setAnInt(2);
        square1.setAnInt(3);
        Square square3 = new Square(4);
        StringBuffer stringBuffer = new StringBuffer("abcdefg");
        System.out.println(stringBuffer);
        stringBuffer.append("hijk");
        System.out.println(stringBuffer);
        stringBuffer.delete(2,5);
        System.out.println(stringBuffer);
//        ad = "bbb";
        String fragment = "abcdefghijklmnopqrstuvwxyz";
        int times = 10000;
        // 通过String对象
        long timeStart1 = System.currentTimeMillis();
        String str1 = "";
        for (int i = 0; i < times; i++) {
            str1 += fragment;
        }
        long timeEnd1 = System.currentTimeMillis();
//        System.out.println("String: " + (timeEnd1 - timeStart1) + "ms");
        // 通过StringBuffer
        long timeStart2 = System.currentTimeMillis();
        StringBuffer str2 = new StringBuffer();
        for (int i = 0; i < times; i++) {
            str2.append(fragment);
        }
        long timeEnd2 = System.currentTimeMillis();
//        System.out.println("StringBuffer: " + (timeEnd2 - timeStart2) + "ms");
//        Square.square(2);

//        Square square = new Square();
        int a = Math.abs(-2);
    }
}