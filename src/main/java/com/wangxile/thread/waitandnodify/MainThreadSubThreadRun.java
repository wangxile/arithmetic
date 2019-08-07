package com.wangxile.thread.waitandnodify;

public class MainThreadSubThreadRun {

    public static void main(String[] args) throws InterruptedException {
        final Object object = new Object();
        new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 50; i++) {
                    synchronized (object) {
                        for (int j = 0; j < 10; j++) {
                            System.out.println("SubThread:" + (j + 1));
                        }
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        for (int i = 0; i < 50; i++) {
            synchronized (object) {
                //主线程让出锁，等待子线程唤醒
                object.wait();
                for (int j = 0; j < 100; j++) {
                    System.out.println("MainThread:" + (j + 1));
                }
                object.notify();
            }
        }
    }
}
