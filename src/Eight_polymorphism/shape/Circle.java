package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/3.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void test() {
        System.out.println("Circle.test()");
    }

}
