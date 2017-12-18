package schedule;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by DELL on 2017/11/27.
 */
public class TestSchedule {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Executor executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++)
            executor.execute(task);
    }

    public static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + ":Thread ID:" + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

