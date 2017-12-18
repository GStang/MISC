package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DELL on 2017/3/2.
 * 网络编程之客户端
 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8888);
    }

}
