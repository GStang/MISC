package network;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * Created by DELL on 2017/3/2.
 * 创建客户端和端口
 */
public class MyClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket clinet = new DatagramSocket(6666);
        String msg = "udp编程";
        byte[] data = msg.getBytes("utf-8");
        DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress(8888));
        clinet.send(packet);
        clinet.close();
    }

}
