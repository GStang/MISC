package Ten_Inner;

/**
 * Created by DELL on 2016/12/30.
 * 内部类的对象其实和外部类的引用是有关联的，如果在创建内部类对象的时候没有
 * 外部类的引用，就会报错
 * 所以在拥有外部类对象之前，是不能拥有内部类的对象的，
 * .this语法的使用，可以在内部类返回它的外部类引用。
 *
 * 外部类是可以访问内部类的private元素的
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    private class Inner {
        private int a;

        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {

        Inner b = new Inner();
        b.a = 2;
        return b;
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
