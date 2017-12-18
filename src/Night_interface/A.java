package Night_interface;

/**
 * Created by DELL on 2017/1/5.
 * 类里面可以嵌套接口，并且接口可以是private的和protected的
 * 而接口中嵌套的接口，默认是public的
 */
public class A {
    private interface G{}
    public interface B{}
    interface C{}
    protected interface Gb{}
}
interface Tet{
      interface G{}
}

