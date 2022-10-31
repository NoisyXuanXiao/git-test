package com.xuanxiao.thread;

/*
   创建多线程方式二：实现Runnable接口
   1.创建一个实现了Runnable接口的类
   2.实现类去实现Runnable中的抽象方法run()
   3.创建实现类的对象
   4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
   5.通过Thread类的对象调用start()

   比较两种线程的创建方式
   开发中：优先选择实现Runnable接口的方式
   原因：1.实现的方式没有类的单继承的局限性
        2.实现的方式更适合来处理多个线程有共享数据的情况
   联系：两种方式都需要重写run()，将线程的执行逻辑声明在run()中

 */

// 1.创建一个实现了Runnable接口的类
class MThread implements Runnable{

    private int ticket = 100;

    // 2.实现类去实现Runnable中的抽象方法run()
    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+":卖票，票号为"+ticket);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                ticket--;

            }else {
                break;
            }
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        // 3.创建实现类的对象
        MThread mThread = new MThread();
        // 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread);
        Thread t2 = new Thread(mThread);
        Thread t3 = new Thread(mThread);
        // 5.通过Thread类的对象调用start()
        t1.setName("线程一");
        t1.start();
        t2.setName("线程二");
        t2.start();
        t3.setName("线程三");
        t3.start();
    }
}
