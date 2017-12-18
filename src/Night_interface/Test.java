package Night_interface;

/**
 * Created by DELL on 2017/1/4.
 */
public abstract class Test {
    public void test2(){}
}
class Test2 extends Test{
    public static Test2 test(Test t){
        return (Test2) t;
    }

    public static void main(String[] args) {

    }
}
