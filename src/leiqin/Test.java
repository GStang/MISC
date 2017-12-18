package leiqin;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by DELL on 2017/11/2.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String name;
        Work work = null;
        try {
            work = new Work("d:/naruto.txt");
            Thing[] thing = {
                    new Thing("test1", 1, 3.5, 55),
                    new Thing("test2", 2, 12.5, 0),
                    new Thing("test3", 3, 8.9, 89),
                    new Thing("test4", 4, 1.2, 123)
            };
            for (int i = 0; i < thing.length; i++)
                work.writeThing(thing[i], i);
            for (int i = 0; i < thing.length; i++)
                work.readThing(i);
            System.out.println("请输入要查询商品编号");
            number = scanner.nextInt();
            work.readThing(number - 1);
            System.out.println("请输入要修改某一商品名字：编号和名字");
            number = scanner.nextInt();
            name = scanner.next();
            work.setThingName(number - 1, name);
            work.readThing(number - 1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

