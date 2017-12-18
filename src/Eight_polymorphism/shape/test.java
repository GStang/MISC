package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/3.
 */
public class test {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Tricycle tricycle = new Tricycle();
        bicycle.ride();
        unicycle.ride();
        tricycle.ride();
    }
}
