package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by DELL on 2017/1/16.
 */
public class TextFile extends ArrayList<String > {
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(fileName)
            );
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals("")) remove(0);
    }

    public TextFile(String fileName) {
        this(fileName, "\n");
    }

    public void write(String fileName) {
        try{
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile()
            );
            try{
                for (String item : this) {
                    out.println(item);
                }
            }finally {
                out.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String file = read(".\\src\\io\\TextFile.java");
        write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("text2.txt");
        TreeSet<String> words = new TreeSet<>(new
                TextFile(".\\src\\io\\TextFile.java", "\\w+"));
        System.out.println(words.headSet("a"));
    }
}
