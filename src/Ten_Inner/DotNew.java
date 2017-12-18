package Ten_Inner;

/**
 * Created by DELL on 2016/12/30.
 * .new关键字可以创建某个内部类的对象。要实现这个目的，
 * 需要提供外部类的引用。
 */
public class DotNew {

    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
//        DotNew.Inner dni2 = new dn.Inner(); 错误的声明方式

    }
}
