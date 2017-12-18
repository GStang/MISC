package lanqiao;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/3/9.
 */
public class B7_3 {

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a, b, c, d, e, f, g, h, i;
        int count = 0;
        int temp = 0;
        for (int j = 0; j < 9; j++) {
            temp=j;
            a = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            b = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            c = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            d = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            e = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            f = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            g = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            h = list[temp];
            temp++;
            if (temp==9)
                temp=0;
            i = list[temp];
//            System.out.println(a + "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i);
            System.out.println(a + (double) b / c + (double) (d * 100 + e * 10 + f) / (double) (g * 100 + h * 10 + i));
            if (a + (double) b / c + (double) (d * 100 + e * 10 + f) / (double) (g * 100 + h * 10 + i) == 10) {
                count++;
                System.out.println(a + "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i);
            }
        }
        System.out.println(count);
    }
}
