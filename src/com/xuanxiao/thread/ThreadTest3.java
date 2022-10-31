package com.xuanxiao.thread;

class MThread3 implements Runnable{

    private int ticket = 100;
    // Object obj = new Object();

    // 2.实现类去实现Runnable中的抽象方法run()
    @Override
    public void run() {
        while (true){
            //synchronized (this){ //此时this是MThread3中唯一的对象 可以用
            show();
            //}
        }
    }

    private synchronized void show(){//同步监视器：this
        if (ticket>0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+":卖票，票号为"+ticket);

            ticket--;
        }
    }
}

public class ThreadTest3 {
    public static void main(String[] args) {
        // 3.创建实现类的对象
        MThread3 mThread3 = new MThread3();
        // 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread3);
        Thread t2 = new Thread(mThread3);
        Thread t3 = new Thread(mThread3);
        // 5.通过Thread类的对象调用start()
        t1.setName("线程一");
        t1.start();
        t2.setName("线程二");
        t2.start();
        t3.setName("线程三");
        t3.start();
    }
}
