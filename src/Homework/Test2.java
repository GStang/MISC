package Homework;

/**
 * Created by DELL on 2016/10/14.
 */
abstract class A {
    public abstract void f(int x);

    public abstract void g(int x, int y);

    public abstract double h(double x);
}

class add1 extends A {
    @Override
    public void f(int x) {
        System.out.println(x + 1);
    }

    @Override
    public void g(int x, int y) {
        int z = x + y + 1;
        System.out.println(z);
    }

    @Override
    public double h(double x) {
        return x + 1;
    }
}

class add2 extends A {
    @Override
    public void f(int x) {
        System.out.println(x + 2);
    }

    @Override
    public void g(int x, int y) {
        int z = x + y + 2;
        System.out.println(z);
    }

    @Override
    public double h(double x) {
        return x + 2;
    }
}

class add3 extends A {
    public void f(int x) {
        System.out.println(x + 3);
    }

    public void g(int x, int y) {
        int z = x + y + 3;
        System.out.println(z);
    }

    public double h(double x) {
        return x + 3;
    }
}

public class Test2 {
    public static void main(String args[]) {
        A a;
        add1 b1 = new add1();
        System.out.println("b1的上转型对象调用方法的结果:");
        a = b1;
        a.f(1);
        a.g(1, 1);
        System.out.println(a.h(1));
        add2 b2 = new add2();
        System.out.println("b2的上转型对象调用方法的结果:");
        a = b2;
        a.f(1);
        a.g(1, 1);
        System.out.println(a.h(1));
        add3 b3 = new add3();
        System.out.println("b3的上转型对象调用方法的结果:");
        a = b3;
        a.f(1);
        a.g(1, 1);
        System.out.println(a.h(1));
    }
}