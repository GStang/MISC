package Test;

/**
 * Created by DELL on 2017/3/10.
 */
public class SonSmall extends Father {
    public SonSmall(String s) {
        super(s);
    }

    @Override
    public void talk() {
        System.out.println("我是小儿子");
    }
}
