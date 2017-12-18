package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/1/10.
 */
public class DirList3 {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        System.out.println(args.length);
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        }
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
