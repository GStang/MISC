package Eight_polymorphism.shape;

import java.util.Random;

/**
 * Created by DELL on 2017/1/3.
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
        }
    }
}
