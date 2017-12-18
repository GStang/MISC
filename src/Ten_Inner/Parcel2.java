package Ten_Inner;

/**
 * Created by DELL on 2016/12/30.
 */
public class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }//内部类Contents

    class Destination {
        private String lable;

        Destination(String whereTo) {
            lable = whereTo;
        }


        public String readlable() {
            return lable;
        }
    }//内部类Destination

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readlable());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }

}
