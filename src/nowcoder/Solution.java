package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by DELL on 2017/9/27.
 */
public class Solution {
//    static long time1;
//    static long time2;


    public static int LastRemaining_Solution2(int n, int m) {
        long start = System.currentTimeMillis();

        if (n == 0 || m == 0) return -1;
        int s = 0;
        for (int i = 2; i <= n; i++) {
            s = (s + m) % i;
        }
        long end = System.currentTimeMillis();
//        time2 =  end-start;
        return s;
    }

    public static boolean Find(int target, int[][] array) {
        int hang = array.length;
        int lie = array[0].length;
//        int surehang = 0;
        //最后一行第一个
//        if (array[hang - 1][0] == target) {
//            return true;
//        }
//        //最后一行
//        if (array[hang - 1][0] < target) {
//            for (int i = 0; i < array[hang - 1].length - 1; i++) {
//                if (array[hang - 1][i] == target) {
//                    return true;
//                } else if (array[hang - 1][i] > target) {
//                    break;
//                }
//            }
//        }

        //不在最后一行
        System.out.println(hang);
        for (int i = 0; i < hang; i++) {
//            找到第一个比target小的一行
            try {
                if (array[i][0] <= target) {
//                System.out.println(i);
                    //判断是否在surehang
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] == target) {
                            return true;
                        } else if (array[i][j] > target) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public static String replaceSpace(StringBuffer str) {
        int length = str.length();
        String[] strings = str.toString().split(" ");
        StringBuilder sb = new StringBuilder();
        if (length == 0) {
            return str.toString();
        }
        for (String s : strings) {
            sb.append(s);
            sb.append("%20");
            System.out.println(s);
        }
        if (strings.length != 0) {
            sb.deleteCharAt(sb.lastIndexOf("%"));
            sb.deleteCharAt(sb.lastIndexOf("2"));
            sb.deleteCharAt(sb.lastIndexOf("0"));
        }

//        System.out.println(length);
        try {
            if (str.charAt(str.toString().lastIndexOf(" ")) == str.charAt(length - 1))
                sb.append("%20");
        } catch (Exception e) {

        }
        return sb.toString();
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            list.add(stack.pop());
        }

        return list;
    }

   static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        if (stack2.empty()) {
            stack1.push(node);
        } else {
            int size = stack2.size();
            for (int i =0; i<size;i++) {
                stack1.push(stack2.pop());
            }
            stack1.push(node);
        }
    }

    public static int pop() {
        int result = 0;
        if (stack2.empty()) {
            if (stack1.empty()) {
                return 0;
            } else {
                int size = stack1.size();
                for (int i = 0; i <size; i++) {
                    stack2.push(stack1.pop());
                }
                result = stack2.pop();
            }
        } else {
            result = stack2.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int r =0;
        push(1);
        push(2);
        push(3);
         r = pop();
        System.out.println(r);
        r = pop();
        System.out.println(r);

        push(4);
        r = pop();
        System.out.println(r);

        push(5);
        r = pop();
        System.out.println(r);

        r = pop();
        System.out.println(r);

    }
}