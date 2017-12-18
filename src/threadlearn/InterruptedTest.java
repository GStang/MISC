package threadlearn;

/**
 * Created by DELL on 2017/11/1.
 */
public class InterruptedTest {


    public static void main(String[] args) {
        Thread t1= new Thread(){
            @Override
            public void run() {
                while (true){
                    System.out.println("test");

                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("Interruted");
                        break;
                    }
                    try{
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
//                    e.printStackTrace();
                        System.out.println("Interruted When Sleep");
//                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        };
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }
}
