package lanqiao;

/**
 * Created by DELL on 2017/3/9.
 */
public class B7_1 {
    public static void main(String[] args) {
        int i = 1, count = 0, all = 0;
//        i表示每一层个数，count表示层数，all表示总数
        for (count = 1; count <= 100; count++) {
            all += i;
            i = i + count+1;
        }
        System.out.println(all);
    }
}
