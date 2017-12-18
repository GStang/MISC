package Homework;

import java.util.*;

/**
 * Created by DELL on 2016/11/13.
 */
public class Test1  {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcde");
        Map<String,? extends Collection<Integer>> map;
        map = new HashMap<>();
        map = new LinkedHashMap<String ,List<Integer>>();
        s.append("f");
        String str = new String ("ghi");
        s.append(str);
        String s1 = (String) str.subSequence(0,1);
        System.out.println(s1);
        System.out.println(s);
    }

}