package Homework;

/**
 * Created by DELL on 2016/12/20.
 */
public class Son extends Father {

    @Override
    public void two() {
//        super.two();
        System.out.printf("Son");
    }

    public static void main(String[] args) {
        Son son = new Son();
        Father father = son;
       father.three();
        son.three();
        son.two();

    }
}
