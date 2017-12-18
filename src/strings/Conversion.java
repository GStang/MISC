package strings;

import java.util.Formatter;

/**
 * Created by DELL on 2017/1/12.
 */
public class Conversion {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        formatter.format("c : %s", u);
        System.out.println("\n");
        formatter.format("c : %b", u);
    }
}
