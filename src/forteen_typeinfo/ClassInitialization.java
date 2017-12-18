package forteen_typeinfo;

import java.util.Random;

/**
 * Created by DELL on 2017/1/8.
 */
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFianl2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("forteen_typeinfo.Initable3");
        //此处必须传入带有包名的类名g
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);

    }
}

class Initable{
    static final int staticFinal = 47;
    static final int staticFianl2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}


