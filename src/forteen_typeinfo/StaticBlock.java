package forteen_typeinfo;

import java.io.File;

/**
 * Created by DELL on 2017/1/10.
 */
class StaticBlock {
    File file;
     static {
        d = 5;
        e = 10;
        System.out.println("Initializing");
    }

    static final int d;
    StaticBlock(int a){
        e = a;
    }
    static int e = 5;

    StaticBlock() {
        System.out.println("Building");
    }
    static class Test{
        public static void main(String[] args) {
//            int  a=1 ;
//            System.out.println(a);
            System.out.println(StaticBlock.d);
            System.out.println(StaticBlock.e);
        }
    }
}