package io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/1/10.
 */
public final class Directory {
    public static File[]
    local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
//                return false;
            }
        });
    }
    public static File[]
    local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterator<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        public Iterator<File> iterator(){
            return files.iterator();
        }

        void addAll(TreeInfo other){
            files.addAll(other.files);
        }

        @Override
        public String toString() {
            return "dirs:" ;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public File next() {
            return null;
        }
    }

}

