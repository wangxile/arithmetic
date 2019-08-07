package com.wangxile.thread.waitandnodify;

public class MainThreadSubThreadRun2 {
    //子线程循环 10 次，接着主线程循环 100，接着又回到子线程循环 10 次，接着再回到主线程又循环 100，如此循环 50 次，请写出程序。
    private static boolean bShouldMain = false;

    public static void main(String[] args) {
        new Thread(
                new Runnable() {
                    public void run() {
                        synchronized (MainThreadSubThreadRun2.class) {
                            for (int i = 0; i < 50; i++) {
                                while (bShouldMain) {
                                    try {
                                        MainThreadSubThreadRun2.class.wait();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                for (int j = 0; j < 10; j++) {
                                    System.out.println(Thread.currentThread().getName() + "i=" + i + ",j=" + j);
                                }
                                bShouldMain = true;
                                MainThreadSubThreadRun2.class.notify();
                            }
                        }
                    }
                }
        ).start();
        new Thread(
                new Runnable() {
                    public void run() {
                        synchronized (MainThreadSubThreadRun2.class) {
                            for (int i = 0; i < 50; i++) {
                                while (!bShouldMain) {
                                    try {
                                        MainThreadSubThreadRun2.class.wait();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                for (int j = 0; j < 10; j++) {
                                    System.out.println(Thread.currentThread().getName() + "i=" + i + ",j=" + j);
                                }
                                bShouldMain = false;
                                MainThreadSubThreadRun2.class.notify();
                            }
                        }
                    }
                }
        ).start();
    }
}

