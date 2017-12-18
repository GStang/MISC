package lanqiao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by DELL on 2017/3/9.
 */
public class B7_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for (int i = 0; i <Math.sqrt(b); i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= j; k++) {
                    for (int m = 0; m <= k; m++) {
                        if (i * i + j * j + k * k + m * m == b) {
                            System.out.println(m + " " + k + " " + j + " " + i);
                        }
                    }
                }
            }
        }
    }
}
