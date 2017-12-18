package Test;

import java.util.Scanner;

/**
 * Created by DELL on 2017/1/24.
 */
public class Compare {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a:");
        a = sc.nextInt();
        System.out.println("请输入b:");
        b = sc.nextInt();
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
