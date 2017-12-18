package current;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by DELL on 2017/7/30.
 */
public class ThreadPoolDemo {
    public static class Mytask implements Runnable{

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+"Thread ID:"+Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Mytask task = new Mytask();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i =0;i<10;i++){
            es.submit(task);
        }
    }

}
