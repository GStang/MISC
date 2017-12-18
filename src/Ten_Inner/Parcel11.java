package Ten_Inner;

/**
 * Created by DELL on 2017/1/6.
 * 嵌套类的对象创建可以直接使用和普通类相同的创建方式
 * 意思是可以直接new出来，
 * 内部类的创建就不用拥有外部类的对象了
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    private static class ParcelDestination implements Destination {
        //        静态内部类，称作嵌套类
        private String label;

        @Override
        public String readLabel() {
            return label;
        }

        private ParcelDestination(String whereto) {
            label = whereto;
        }
//      嵌套类可以容纳其他的static域

        public static void f() {
        }

        static int x = 10;
//      内部类的内部再添加内部类
        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}
