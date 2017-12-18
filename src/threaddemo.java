/**
 * Created by DELL on 2017/4/7.
 */
public class threaddemo implements Runnable {
    @Override
    public void run() {
        for (int i =0;i<200;i++)
        System.out.println("我是第一个线程");
    }

    static class Second implements Runnable {
        @Override
        public void run() {
            for (int i =0;i<200;i++)
            System.out.println("我是第二个线程");
        }
    }

    static class Test{
        public static void main(String[] args) {
//            ThreadLocal
            threaddemo threaddemo = new threaddemo();
            Second second = new Second();
//            for (int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(threaddemo);
            Thread thread2 = new Thread(second);
            thread1.start();
            thread2.start();
//            }
        }
    }
}
