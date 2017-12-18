package threadlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by DELL on 2017/12/1.
 * <p>
 * 这种方法会导致异常，因为Date.parse方法不是线程安全的
 */
public class ThreadLocalTest {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static class ParseDate implements Runnable {
        int i = 0;

        public ParseDate(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            try {
                Date t = sdf.parse("2015-03-29 19:29:" + i % 60);
                System.out.println(i + ":" + t);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            ExecutorService es = Executors.newFixedThreadPool(10);
            for (int i = 0; i < 1000; i++) {
                es.execute(new ParseDate(i));
            }
        }
    }
}
