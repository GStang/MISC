import sun.misc.FloatingDecimal;

import java.io.*;
import java.math.BigDecimal;

/**
 * Created by DELL on 2017/11/4.
 */
public class CVS {

    public static BigDecimal getResult(BigDecimal[] ints) {
        BigDecimal changshu = new BigDecimal(0.100463156806255);
        BigDecimal x1 = new BigDecimal(0.00319824962409806);
        BigDecimal x2 = new BigDecimal(0.00270936533067604);
        BigDecimal x3 = new BigDecimal(-0.0449599928889613);
        BigDecimal x4 = new BigDecimal(0.0117074395602448);
        BigDecimal x5 = new BigDecimal(0.0148613199071305);
        BigDecimal x6 = new BigDecimal(0.0358027611160174);
        BigDecimal x7 = new BigDecimal(-0.0774476208659742);
        BigDecimal x8 = new BigDecimal(-0.00565728142838821);

        BigDecimal result1 = x1.multiply(ints[0]);
        BigDecimal result2 = x2.multiply(ints[1]);
        BigDecimal result3 = x3.multiply(ints[2]);
        BigDecimal result4 = x4.multiply(ints[3]);
        BigDecimal result5 = x5.multiply(ints[4]);
        BigDecimal result6 = x6.multiply(ints[5]);
        BigDecimal result7 = x7.multiply(ints[6]);
        BigDecimal result8 = x8.multiply(ints[7]);
        BigDecimal result = result1.add(result2).add(result3).add(result4).add(result5).add(result6).add(result7)
                .add(result8).add(changshu);
        BigDecimal answer = result.setScale(6, BigDecimal.ROUND_DOWN);
        return answer;
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("G:\\JAVA\\JAVAworkplace\\src\\test.csv"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("G:\\JAVA\\JAVAworkplace\\src\\answer.csv"));
            String s = null;
            int[] ints = new int[8];
            BigDecimal[] bigDecimals = new BigDecimal[8];

            while ((s = reader.readLine()) != null) {
                String[] strs = s.split(",");

                for (int i = 0; i < 8; i++) {
                    bigDecimals[i] = new BigDecimal(strs[i]);
                }
                BigDecimal result = getResult(bigDecimals);
//                System.out.println(i+++ " "+result.toString());
                writer.write(result.toString());
                writer.newLine();
            }

            writer.close();
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
