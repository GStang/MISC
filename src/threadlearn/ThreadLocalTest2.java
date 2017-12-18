package threadlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DELL on 2017/12/1.
 * 这个是对ThreadLocalTest的改进，使用了ThreadLocal让每一个都持有SimpleDateFormat对象
 */
public class ThreadLocalTest2 {
    private static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<>();

    public static class ParseDate implements Runnable {
        int i = 0;

        public ParseDate(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            try {
                if (t1.get() == null) {
                    t1.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
                }
                Date t = t1.get().parse("2017-12-1 13:26:" + i % 60);
                System.out.println(i + ":" + t);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }


}
