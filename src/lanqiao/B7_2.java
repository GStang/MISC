package lanqiao;

/**
 * Created by DELL on 2017/3/9.
 */
public class B7_2 {

    public static void main(String[] args) {
        int age;
        int all = 0;
        int temp = 0;
        for (age = 0; age < 100; age++) {
//            System.out.println(age);
            temp = age;
            all = 0;
            do {
                all += temp;
                temp = temp + 1;
//                System.out.println(all);
                if (all == 236) {
                    System.out.println(temp);
                    System.out.println(all);
                }
            } while (all <= 236);
        }
    }

}
