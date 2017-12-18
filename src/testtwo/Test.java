package testtwo;

/**
 * Created by DELL on 2017/3/10.
 */
public class Test {
    static One one = new One() {
        @Override
        public void speak() {

        }
    };
    public static void main(String[] args) {
        one = new ImplOne();
        one.speak();
    }
}
