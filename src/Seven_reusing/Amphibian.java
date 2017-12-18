package Seven_reusing;

/**
 * Created by DELL on 2016/12/31.
 * 在子类向上转型后，新的对象会丢失子类所拥有的方法和属性
 * 但是由于多态的存在，上转型后对父类操作，对象会拥有子类重载的方法
 */
public class Amphibian {
    public void test1(){}
    public void test2(){}

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = frog;
        frog.test3();
        amphibian.test1();
        amphibian.test2();
    }
}
