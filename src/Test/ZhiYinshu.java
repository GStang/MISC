package Test;

import java.util.Scanner;

/**
 * Created by DELL on 2017/2/17.
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5;
 */
public class ZhiYinshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
//        判断输入的数字是否能分解
        while (num <= 1) {
            System.out.println("请输入一个大于一的正整数");
            num = sc.nextInt();
        }

        resolve(num);
    }

//    分解质因数并输出结果
    private static void resolve(int number) {
        String str = "";
        int i = 2;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                str += i + "*";
                number = number / i;
                i--;
            }
        }
        str += i;
        System.out.println(number + "的分解质因素结果为：" + str);
    }
}
