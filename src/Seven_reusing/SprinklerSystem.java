package Seven_reusing;

/**
 * Created by DELL on 2016/12/31.
 *
 * 组合
 */
class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";

    }

    @Override
    public String toString() {
//        return super.toString();
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
//        return super.toString();
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 =" + valve4 + " " +
                "i = " + i + "" + "f=" + f + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
