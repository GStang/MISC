package nowcoder;

import java.util.LinkedList;

/**
 * Created by DELL on 2017/12/9.
 */
public class BinSolution {
//    public int NumberOf1(int n) {
//        String s =Integer.toBinaryString(i);
//
//    }

    public static void main(String[] args) {
        String s = Integer.toBinaryString(-2);
//        System.out.println(s);
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i =0;i<chars.length;i++) {
            if (chars[i] == '1') {
                count++;
            }
        }
        System.out.println(count);

    }
}
