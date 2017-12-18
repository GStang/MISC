package Homework;


        import java.util.Scanner;

/**
 * Created by DELL on 2016/10/14.
 */

public class Test4 {
    public static boolean checkEmail(String email) {

        String reg = "(\\w+((-\\w+)|(\\.\\w+))*)+@[A-Z,a-z,0-9]+((\\.|-)[A-Z,a-z,0-9]+)*\\.[A-Z,a-z,0-9]+";
        if (email.matches(reg)) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {

        {
            String email;
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个邮箱地址：");
            email = scanner.nextLine();
            if (checkEmail(email))// 验证邮箱
            {
                System.out.println(email + "\n是合法的邮箱名。");
            } else {
                System.out.println(email + "\n不是合法的邮箱名。");
            }
        }
    }

}