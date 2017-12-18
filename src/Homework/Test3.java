package Homework;

/**
 * Created by DELL on 2016/10/14.
 */
interface Jiekou {
    public abstract void f(int x);

    public abstract void g(int x, int y);

    public abstract double h(double x);

    public double abc(int a);
}

class First implements Jiekou {
    public void f(int x) {
        System.out.println(x + 1);
    }

    public void g(int x, int y) {
        int z = x + y + 1;
        System.out.println(z);
    }

    public double h(double x) {
        return x + 1;
    }

    @Override
    public double abc(int a) {
        return 0;
    }
}

public class Test3 {
    public static void main(String args[]) {
        Jiekou jiekou;
        jiekou = new First();
        System.out.println("接口回调的结果是:");
        jiekou.f(1);
        jiekou.g(1, 1);
        System.out.println(jiekou.h(1));
    }
}