package Ten_Inner;

/**
 * Created by DELL on 2016/12/30.
 */
public class Parcell {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }//内部类
    }

    class Destination {
        private String lable;

        Destination(String whereTo) {
            lable = whereTo;
        }

        String readLabel() {
            return lable;
        }
    }//内部类

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }//Parcell类的方法

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("Tasmania");
    }
}
