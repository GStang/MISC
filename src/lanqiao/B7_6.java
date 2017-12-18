package lanqiao;

/**
 * Created by DELL on 2017/3/9.
 */
public class B7_6 {

    public static void main(String[] args) {
        int[][][] ints = new int[3][4][3];
        for (int i = 0; i < 3; i++) {
            ints[i][i][i]=i;
            for (int j = 0; j < 4; j++) {
                ints[j][j][j]=j;
                for (int k = 0; k < 3; k++) {
                    ints[k][k][k]=k;
                }
            }
        }
    }
}
