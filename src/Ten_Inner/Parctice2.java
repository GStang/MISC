package Ten_Inner;

/**
 * Created by DELL on 2016/12/30.
 */
public class Parctice2 {
    private String s;

    @Override
    public String toString() {
//        return super.toString();
        return s;
    }

    public Parctice2(String src) {
        s = src;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
        Selector selector = sequence.selector();
        sequence.add(new Parctice2("a"));
        sequence.add(new Parctice2("b"));
        sequence.add(new Parctice2("c"));
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
