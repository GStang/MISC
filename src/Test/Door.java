package Test;

/**
 * Created by DELL on 2017/2/17.
 * 这个是抽象的门,
 */
public abstract class Door {
    //    由于开门关门是所有的门都具有的共有功能，
// 因此这里直接在父类中完成定义，没有将方法再写成抽象
    public void openDoor() {
        System.out.println("开门");
    }

    public void closeDoor() {
        System.out.println("关门");
    }
}
