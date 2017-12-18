package nowcoder;

/**
 * Created by DELL on 2017/12/9.
 */
public class FangGeSolution {
    public static int RectCover(int target) {
        if (target == 1)
            return 1;
        else if (target == 2)
            return 2;
        else
            return RectCover(target - 1) + RectCover(target - 2);

    }

    public static void main(String[] args) {
        int result = RectCover(1000);
        System.out.println(result);
    }
}
