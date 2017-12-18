package fibonacci;

import java.util.Scanner;

/**
 * Created by DELL on 2016/11/1.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i=1; i <= a; i++) {
            int b = fiboancci(i);
            System.out.print(b + " ");
        }
    }

    public static int fiboancci(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }else
        return fiboancci(a - 1) + fiboancci(a - 2);
    }
}

