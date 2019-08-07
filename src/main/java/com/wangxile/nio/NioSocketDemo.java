package com.wangxile.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/13
 * @Modified by:
 *          Channe：IO多路复用
 *          Selector: 选择器
 *          Buffer：缓冲区   底层使用数组实现的。
 */
public class NioSocketDemo {
    //通道选择器
    private Selector selector;

    public static void main(String[] args) throws IOException {
        NioSocketDemo nio = new NioSocketDemo();
        nio.initServer(7777);
        nio.listenSelector();
    }

    public void initServer(int port) throws IOException {
        //等于 new ServerSocket();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //服务通道设置成非阻塞的模式
        serverSocketChannel.configureBlocking(false);
        //绑定端口号地址
        serverSocketChannel.socket().bind(new InetSocketAddress(port));
        //开启选择器
        this.selector = Selector.open();
        //每当有客户端连接上来的时候，默认已经连接上来了，记录下这个连接的状态。
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT); //监听连接事件
        System.out.println("服务已启动......" + port);
    }

    public void listenSelector() throws IOException {
        //轮询监听selector
        while (true) {
            //select模型  多路复用
            int wait = this.selector.select();
            if(wait == 0){
                continue;
            }
            Iterator<SelectionKey> iterator = this.selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                //处理请求
                handler(key);
            }
        }
    }
    //处理客户端连接请求事件
    private void handler(SelectionKey selectionKey) throws IOException {
        if (selectionKey.isAcceptable()) {
            ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
            SocketChannel client = server.accept();
            client.configureBlocking(false);
            //接受客户端发送的信息，需要给客户端设置读的权限
            client.register(selector, SelectionKey.OP_READ);
        } else if (selectionKey.isReadable()) {
            //处理读的事件
            SocketChannel client = (SocketChannel) selectionKey.channel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int len = client.read(buffer);
            if (len > 0) {
                buffer.flip();
                String content =  new String(buffer.array(), 0, len);
                client.register(selector, SelectionKey.OP_WRITE);
                System.out.println("服务端收到数据" + content);
            }
            buffer.clear();
        } else if(selectionKey.isWritable()){
            SocketChannel client = (SocketChannel) selectionKey.channel();
            client.write(ByteBuffer.wrap("Hello world".getBytes()));
            client.close();

        }
    }
}
