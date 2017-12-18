package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/1/10.
 * 通过这个例子还可以得到一个结论，args本来就是final的，
 * 因为在内部类中可以直接使用它
 *
 */
public class DirList2 {
    public static FilenameFilter filter(final String regex) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        Scanner scanner = new Scanner(System.in);
        String matcher = scanner.nextLine();
        String[] list;
//        if (args.length == 0) {
//            list = path.list();
//        }else
            list = path.list(DirList2.filter(matcher));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
