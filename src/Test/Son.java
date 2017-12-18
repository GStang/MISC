package Test;

/**
 * Created by DELL on 2017/2/17.
 */
public class Son extends Father {
    public Son(String s) {
        super(s);
    }

    @Override
    public void talk() {
        System.out.println("我是大儿子");
    }
}
