package Homework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by DELL on 2016/11/5.
 */
public class HashSetTest {
    public static void main(String[] args) {
        Integer one = new Integer(1),
                two = new Integer(2),
                three = new Integer(3),
                four = new Integer(4),
                five = new Integer(5),
                six = new Integer(6);
        HashSet<Integer> A = new HashSet<Integer>(),
                B = new HashSet<Integer>(),
                tempSet = new HashSet<Integer>();
        A.add(one);
        A.add(two);
        A.add(three);
        A.add(four);
        B.add(one);
        B.add(two);
        B.add(five);
        B.add(six);
        tempSet = (HashSet<Integer>) A.clone();
        A.removeAll(B);
        B.removeAll(tempSet);
        B.addAll(A);
        int num = B.size();
        System.out.println("A和B的对称集合差有" + num + "个元素:");
        Iterator<Integer> iter = B.iterator();
        while (iter.hasNext()) {
            Integer te = iter.next();
            System.out.printf("%d, ", te.intValue());
        }

    }
}
