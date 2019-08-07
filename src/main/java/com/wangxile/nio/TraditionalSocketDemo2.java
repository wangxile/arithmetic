package com.wangxile.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/13
 * @Modified by:
 */
public class TraditionalSocketDemo2 {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("服务端启动....");

        while (true) {
            Socket socket = serverSocket.accept();
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("有新客户端连接上来了....");
                    InputStream is = null;
                    try {
                        is = socket.getInputStream();
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
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
