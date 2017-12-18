package threadlearn;

/**
 * Created by DELL on 2017/11/1.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("throw Exception");
                throw new Exception("This is a Exception");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}
