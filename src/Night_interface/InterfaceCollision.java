package Night_interface;

/**
 * Created by DELL on 2017/1/5.
 *
 * 接口中的域默认是public static final 的，
 * 并且接口中的常量不允许空final的，
 * 必须是赋值了的
 */
public class InterfaceCollision {
    public static void main(String[] args) {
        C4 c4 = new C4();
//        int a = c4.geta() = c4.geta() + 1;
        System.out.println();
    }
}
class C2 implements I1{

    @Override
    public void f() {

    }
}
class C4 extends C implements I1,I3{
    @Override
    public void f() {
//    return a;
    }
    public int geta(){
    return a;
}
}

class C {
     void f(){}
}
