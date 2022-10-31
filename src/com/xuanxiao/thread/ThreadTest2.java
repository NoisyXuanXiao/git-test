package com.xuanxiao.thread;

/*
   线程安全问题的解决：一个线程操作的时候另一个不能参与进来，即使当前线程是阻塞状态也不行

   方式一：同步代码块
    synchronized(同步监视器){
        // 需要被同步的代码（操作共享数据的代码，多个线程共同操作的变量即为共享数据）
        // 同步监视器，俗称：锁 任何一个类的对象都可以充当锁
           要求：多个线程必须要共用同一把锁
    }

   方式二：同步方法
        如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明为同步的

 */
// 1.创建一个实现了Runnable接口的类
class MThread2 implements Runnable{

    private int ticket = 100;
    Object obj = new Object();

    // 2.实现类去实现Runnable中的抽象方法run()
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket>0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":卖票，票号为"+ticket);

                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        // 3.创建实现类的对象
        MThread2 mThread2 = new MThread2();
        // 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread2);
        Thread t2 = new Thread(mThread2);
        Thread t3 = new Thread(mThread2);
        // 5.通过Thread类的对象调用start()
        t1.setName("线程一");
        t1.start();
        t2.setName("线程二");
        t2.start();
        t3.setName("线程三");
        t3.start();
    }
}
