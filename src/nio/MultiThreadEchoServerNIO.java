package nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by DELL on 2017/12/7.
 */
public class MultiThreadEchoServerNIO {
    private Selector selector;
    private ExecutorService tp = Executors.newCachedThreadPool();

    public static Map<Socket, Long> time_stat = new HashMap<>(10240);

    private void startServer() throws Exception {
        selector = SelectorProvider.provider().openSelector();
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false);
//        InetSocketAddress isa = new InetSocketAddress(InetAddress.getLocalHost(), 8000);
        InetSocketAddress isa = new InetSocketAddress(8000);
        ssc.socket().bind(isa);
        SelectionKey acceptKey = ssc.register(selector, SelectionKey.OP_ACCEPT);

        for (; ; ) {
            selector.select();
            Set readKeys = selector.selectedKeys();
            Iterator i = readKeys.iterator();
            long e = 0;
            while (i.hasNext()) {
                SelectionKey sk = (SelectionKey) i.next();
                i.remove();
                if (sk.isAcceptable()) {
                    doAccept(sk);
                } else if (sk.isValid() && sk.isReadable()) {
                    if (!time_stat.containsKey(((SocketChannel) sk.channel()).socket()))
                        time_stat.put(((SocketChannel) sk.channel()).socket(), System.currentTimeMillis());
//                    doRead(sk);
                } else if (sk.isValid() && sk.isWritable()) {
//                    doWrite(sk);
                    e = System.currentTimeMillis();
                    long b = time_stat.remove(((SocketChannel) sk.channel()).socket());
                    System.out.println("spend" + (e - b) + "ms");
                }
            }
        }
    }

    private void doAccept(SelectionKey sk) {
        ServerSocketChannel server = (ServerSocketChannel) sk.channel();
        SocketChannel clientChannel;
        try{
            clientChannel = server.accept();
            clientChannel.configureBlocking(false);

            SelectionKey clientKey = clientChannel.register(selector, SelectionKey.OP_READ);
            EchoClient echoClient = new EchoClient();
            clientKey.attach(echoClient);

            InetAddress clientAddress = clientChannel.socket().getInetAddress();
            System.out.println("Accepted connection from" + clientAddress.getHostAddress() + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class EchoClient{
        private LinkedList<ByteBuffer> outq;
        EchoClient(){
            outq = new LinkedList<>();
        }
        public LinkedList<ByteBuffer> getOutputQueue(){
            return outq;

        }

        public void enqueue(ByteBuffer byteBuffer) {
            outq.addFirst(byteBuffer);

        }
    }
}
