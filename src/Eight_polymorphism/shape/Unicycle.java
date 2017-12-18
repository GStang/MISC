package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/3.
 */
public class Unicycle extends Cycle {
//    @Override
//    public Cycle ride() {
////        System.out.println("Unicycle.ride()");
//        return this;
//    }

    @Override
    public int wheels() {
        return 1;
    }
}
