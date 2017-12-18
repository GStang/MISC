package Homework;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DELL on 2017/1/10.
 * Data对象转换为String对象，
 * 使用的时候必须注意格式的正确性。
 */
public class DataToString {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String str = "";

    public static void main(String[] args) {
        DataToString dataToString = new DataToString();
        dataToString.str = dataToString.sdf.format(new Date());
        System.out.println(dataToString.str);
    }
}
