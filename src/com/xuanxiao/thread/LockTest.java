package com.xuanxiao.thread;

/*
   解决线程安全问题的方式三：Lock锁
   1.实例化ReentrantLock
   2.调用锁定方法lock()（在try里面调用，调用后执行方法体）
   3.调用解锁方法unlock()（在finally中调用）

   synchronized与lock异同
   同：二者都可以解决线程安全问题
   不同：synchronized机制自动在执行完同步代码后，自动释放同步监视器
        Lock需要手动的启动同步（lock()），同时结束同步也需要手动实现（unlock()）

 */

import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable{

    private int ticket = 100;

    // 1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                // 2.调用锁定方法lock()
                lock.lock();

                if (ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"售票，票号为"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                // 3.调用解锁方法unlock()
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window window = new Window();

        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        t1.start();
        t2.start();
        t3.start();

    }
}
