package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DELL on 2017/3/2.
 */
public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
//        阻塞式的，意思是socket处于监听状态
        Socket socket1 = socket.accept();
        System.out.println("一个客户端建立连接");
//        FilterInputStream in = new FilterInputStream(new BufferedInputStream(new FileInputStream("C://")));
    }
}
