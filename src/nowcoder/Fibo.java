package nowcoder;

/**
 * Created by DELL on 2017/11/29.
 */
public class Fibo {

    public static int JumpFloorII(int target) {
        if (target == 1)
            return 1;
        else if (target == 2)
            return 2;
        else {
            int count = 1;
            for (int i = target; i >= 1; i--) {
                count = JumpFloorII(i-1) + count;
            }
            return count;
        }
    }


    public static void main(String[] args) {
        System.out.println(JumpFloorII(3));
    }

}
