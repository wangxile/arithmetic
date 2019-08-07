package com.wangxile.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/13
 * @Modified by:
 */
public class TraditionalSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("服务端启动....");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("有新客户端连接上来了....");
            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            while (true) {
                int data = is.read(b);
                if (data != -1) {
                    String info = new String(b, 0, data, "GBK");
                    System.out.println(info);
                } else {
                    break;
                }
            }
        }
    }
}
