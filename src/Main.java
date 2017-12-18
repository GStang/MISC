import java.util.Scanner;

/**
 * Created by DELL on 2017/9/20.
 */
public class Main {
    public static void main(String args[]) {
        int minSize, maxSize;
        Scanner sc = new Scanner(System.in);
        minSize = sc.nextInt();
        maxSize = sc.nextInt();
        int fishnum;
        fishnum = sc.nextInt();
        int[] fishSize = new int[1001];

        for (int i = 1; i <=fishnum; i++) {
            fishSize[i] = sc.nextInt();
        }

        int count = 0;
        int nowSize = minSize;
        for (; nowSize <= maxSize; nowSize++) {
            int flag = 1;
            for (int i = 1; i <=fishnum; i++) {
                if ((nowSize >= fishSize[i] * 2 && nowSize <= fishSize[i] * 10) || (nowSize * 2 >= fishSize[i] && nowSize * 10 <= fishSize[i])) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}