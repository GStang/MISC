package future;

/**
 * Created by DELL on 2018/3/5.
 */
public class A {
    public int a = 10;

    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends A {
    public int a = 20;
    public int func1(int a, int b) {
        return a + b;
    }
}

class ChildClass {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        System.out.println(a.a);
        System.out.println(b.a);
    }
}
