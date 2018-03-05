package base;

/**
 * Created by DELL on 2018/3/5.
 */

import future.A;

/**
 * 验证equals与==的区别
 */
public class Compare {
    int a = 1;
    int b = 1;
    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = "abc";
    String s4 = "abc";
    A a1 = new A();
    A a3 = a1;
    A a2 = new A();
    public static void main(String[] args) {
        Compare compare = new Compare();
        System.out.println(compare.s1.equals(compare.s2));
        System.out.println(compare.s2.equals(compare.s3));
        System.out.println(compare.s1 == compare.s2);
        System.out.println(compare.s1 == compare.s3);
        System.out.println(compare.s4 == compare.s3);

    }
}
