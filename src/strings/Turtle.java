package strings;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by DELL on 2017/1/12.
 */
public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x,int y){
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle torry = new Turtle("Terry", new Formatter(System.err));
        torry.move(2, 3);
        tommy.move(0, 0);
        tommy.move(4, 8);
        tommy.move(3, 4);
    }
}
