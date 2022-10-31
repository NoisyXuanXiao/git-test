package com.xuanxiao.thread;

/*
    测试Thread常用方法
    1.start()：启动当前线程，调用当前线程的run()
    2.run()：通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
    3.currentThread()：静态方法：返回执行当前代码的线程
    4.getName()：获取当前线程的名字
    5.setName()：设置当前线程的名字
    6.yield()：释放当前线程的执行权
    7.join()：在线程a中调用线程b的join()，此时线程a进入阻塞状态，直到线程b完全执行完后，线程a才结束阻塞状态
    8.stop()：强制结束当前线程（最好不要使用）
    9.sleep(long millitime)：让当前线程睡眠指定的毫秒数，在指定的时间内，当前线程是阻塞状态
    10.isAlive()：判断当前线程是否存活

    线程优先级
    1.
    MAX_PRIORITY = 10 --高优先级的线程抢占低优先级线程的CPU执行权，只是从概率上讲，优先级高的线程高概率被执行，并不意味着优先级高的执行完再执行低的。
    NORM_PRIORITY = 5 --默认的优先级
    MIN_PRIORITY = 1
    2.如何获取和设置当前线程优先级
    getPriority()：获取当前线程优先级
    setPriority()：设置当前线程优先级


 */

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }
        }
    }

}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        helloThread.setName("线程一");
        helloThread.setPriority(Thread.MAX_PRIORITY);
        helloThread.start();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }
        }
    }
}
