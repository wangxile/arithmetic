package com.wangxile.thread.dielock;

public class MyLock {

    // 创建两把锁对象
    public static final Object objA = new Object();
    public static final Object objB = new Object();
    

        // 深入分析一下死锁产生的原因
        // 听一下别人是怎么分析这个问题的
        public static void main(String[] args) {
            DieLock dl1 = new DieLock(true);
            DieLock dl2 = new DieLock(false);
            dl1.start();
            dl2.start();
        }

}
