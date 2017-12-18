package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/2/17.
 * 这是写的测试类
 */
public class TestCollection {
    public static void main(String[] args) {
//      测试第一个方法
        Integer a[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ElementJoinerRealize realize = new ElementJoinerRealize();
        String s = realize.join(a, "|");
        System.out.println(s);

//      测试第二个方法
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<5;i++){
            list.add(i);
        }
        s = realize.join(list, "~");
        System.out.println(s);
    }
}
