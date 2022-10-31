package com.xuanxiao.thread;

/*
   多线程的创建方式一：继承于Thread类
   1.创建一个继承于Thread类的子类
   2.重写Thread类的run() --将此线程执行的操作声明在run()中
   3.创建Thread类的子类的对象
   4.通过此对象调用start()
 */

// 1.创建一个继承于Thread类的子类
class  MyThread extends Thread {
    // 2.重写Thread类的run()
    @Override
    public void run() {
        // 遍历100以内所有偶数
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        // 3.创建Thread类的子类的对象
        MyThread myThread = new MyThread();
        // 4.通过此对象调用start()
        myThread.start();

        // 上一级线程与主线程同时执行
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "**************************");
            }
        }

        // 采用匿名子类方法可以简便
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }.start();
    }
}
