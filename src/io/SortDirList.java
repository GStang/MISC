package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/1/12.
 */
public class SortDirList {
    private File path = new File("G:\\JAVA\\JAVAworkplace\\src\\Jackson_learn");

    public static void main(String[] args) {
        String regex = ".*[/.]java";
//        Matcher matcher;
        Pattern pattern = Pattern.compile(regex);
        SortDirList dirList = new SortDirList();
        File path = dirList.path;
        String[] strings = dirList.path.list(new  FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        System.out.println(strings.length);
        for (String dirItem : strings) {
            System.out.println(dirItem);
        }
    }
}
