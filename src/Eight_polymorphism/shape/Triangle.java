package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/3.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void test() {
        System.out.println("Triangle.test()");
    }
}
