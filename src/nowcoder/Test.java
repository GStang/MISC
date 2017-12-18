package nowcoder;

/**
 * Created by DELL on 2017/12/15.
 */
public class Test {
    public double Power(double base, int exponent) {
        double result = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {

                result = base * result;
            }
        } else if ((exponent < 0)) {
            double dao = 1 / base;
            int ex = -exponent;
            for (int i = 0; i < ex; i++) {

                result = result * dao;
            }

        } else {
            return 1;
        }

        return result;

    }

    public void reOrderArray(int[] array) {
        
    }
}
