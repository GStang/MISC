package network;

import java.io.*;
import java.net.*;

/**
 * Created by DELL on 2017/3/2.
 * 这个类封装了IP和主机名
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress addr = InetAddress.getLocalHost();
//        System.out.println(addr.getHostAddress());
//        System.out.println(addr.getHostName());
////        System.out.println(addr);
        URL url = null;
        try {
            url = new URL("http://www.baidu.com");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.html")));
            byte[] b = new byte[1024];
            inputStream.read(b);
            System.out.println(new String(b));
            inputStream.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
