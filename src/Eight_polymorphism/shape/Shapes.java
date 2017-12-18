package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/3.
 * 从这个例子可以看的出来，JAVA是后期绑定，
 * Java通过后期绑定可以实现知道是那个对象调用的方法
 *
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i <s.length;i++)
            s[i] = gen.next();
        for (Shape shape:s){
            shape.test();
        }
    }
}
