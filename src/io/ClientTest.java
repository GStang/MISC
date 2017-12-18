package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by DELL on 2017/12/7.
 */
public class ClientTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket client = null;
        PrintWriter writer = null;
        BufferedReader reader = null;

        try {
            client = new Socket();
            client.connect(new InetSocketAddress("localhost", 8000));
            writer = new PrintWriter(client.getOutputStream(), true);
            writer.println("Hello!");
            Thread.sleep(3000);
            writer.flush();

            reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("from server" + reader.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
            if (client != null) {
                client.close();
            }
        }
    }
}
