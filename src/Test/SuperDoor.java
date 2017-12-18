package Test;

/**
 * Created by DELL on 2017/2/17.
 */
public class SuperDoor extends Door implements OtherFunction {
    //    重写接口中的方法
    @Override
    public void theftproof() {
        System.out.println("我能防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("我能防水");
    }

    @Override
    public void bulletproof() {
        System.out.println("我能防弹");
    }

    //    这里在测试的时候为了少些一个测试类，采用了静态内部类的方式
    public static class Test {

        public static void main(String[] args) {
            SuperDoor superDoor = new SuperDoor();
//            调用父类和接口中的方法
            superDoor.openDoor();
            superDoor.closeDoor();
            superDoor.theftproof();
            superDoor.waterproof();
            superDoor.bulletproof();

        }
    }
}
