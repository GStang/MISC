package Eight_polymorphism.shape;


/**
 * Created by DELL on 2017/1/3.
 * 多态是个很神奇的东西，
 * 私有方法是不能被继承的，因此不能重载
 */
public class Music3 {
    public static void tune(Instrument i ){
        i.play(Node.MIDDLE_C);
    }
    public static void adjust(Instrument i ){
        i.adjust();
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind()
                //new Wind()
        };
        turnAll(orchestra);
    }

    private static void turnAll(Instrument[] orchestra) {

        for (Instrument  i :orchestra){
            tune(i);
            adjust(i);
        }
    }
}
class Instrument{
    void play(Node n){
        System.out.println("Instrument.paly()"+n);
    }
    private void playangain(){
        System.out.println("Instrument.play()");
    }
    String what(){
        return "Instrument";
    }

    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
class Wind extends Instrument{
    @Override
    void play(Node n) {
        System.out.println("Wind.play()"+n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
//        super.adjust();
        System.out.println("Wind adjusting");
    }
}
