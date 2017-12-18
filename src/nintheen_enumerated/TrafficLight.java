package nintheen_enumerated;

import static nintheen_enumerated.Signal.RED;

/**
 * Created by DELL on 2017/1/19.
 */
enum Signal {GREED, YELLOW, RED,}
public class TrafficLight {
    Signal color = RED;
    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREED;
                break;
            case GREED:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is" + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0;i<7;i++) {
            System.out.println(t);
            t.change();
        }
    }
}
