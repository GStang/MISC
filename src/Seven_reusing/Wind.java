package Seven_reusing;

/**
 * Created by DELL on 2016/12/31.
 * 这就是向上转型，将子类转换为父类。
 * 根据以前学的构造函数的顺序可以知道
 * 在子类初始化之前，父类会先一步初始化，
 * 因此子类其实是包含了父类的，
 * 所以可以向上转型为父类
 */
class Instrument {
    public void play() {
    }

    public static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
