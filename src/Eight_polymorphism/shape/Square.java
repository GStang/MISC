package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/3.
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void test() {
        System.out.println("Square.test()");
    }
}
