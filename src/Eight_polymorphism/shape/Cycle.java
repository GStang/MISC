package Eight_polymorphism.shape;

/**
 * Created by DELL on 2017/1/3.
 */
public class Cycle {
    public Cycle ride(){
       int a = wheels();
        System.out.println(a);
        return this;
    }
    public int wheels(){
        return 0;
    }
}
