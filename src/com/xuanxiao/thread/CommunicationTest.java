package com.xuanxiao.thread;

/*
   线程通信举例：使用两个线程打印1-100 线程1、2交替打印
 */

class Number implements Runnable{

    private int number = 1;

    @Override
    public void run() {
        while (true){

            synchronized (this) {
                // 唤醒阻塞的线程
                notify();
                if (number<=100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        // 使得调用如下wait()方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }

    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();

    }
}
