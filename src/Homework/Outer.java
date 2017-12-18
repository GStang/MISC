package Homework;

/**
 * Created by DELL on 2016/12/26.
 * Thinking in Java The Tenth InnerClass
 * practice one
 * 内部类只是拥有外部类的访问权限，而不是拥有外部类的属性和方法，
 * 这个地方和继承一定要区分开来
 */
public class Outer {
    private String str;

    private Outer(String s) {
        str = s;
    }

    private Inner getInner() {
        return new Inner();
    }

    @Override
    public String toString() {
//        return super.toString();
        return str;
    }

    private class Inner {
        @Override
        public String toString() {
//            return super.toString();
            return str;
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer("a");
        Outer.Inner in = out.getInner();
        System.out.println(in.toString());
//        System.out.println(in.str);
        //从这里就可以看出，in不具有str这个属性
    }
}
