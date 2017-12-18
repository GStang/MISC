package schedule;

import java.util.concurrent.*;

/**
 * Created by DELL on 2017/11/27.
 */
public class RejectThreadPoolDemo {
    public static class MyTast implements Runnable {

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + "Thread ID :"
                    + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyTast task = new MyTast();
        ExecutorService es =
                new ThreadPoolExecutor(
                        5, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(10),
                        (r, executor) -> System.out.println(r.toString() + "is discard"));
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Future re = es.submit(task);
            re.get();
//            Thread.sleep(10);
        }
    }
}
