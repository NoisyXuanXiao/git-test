package com.xuanxiao.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*
   创建线程的方式四：线程池
   1.提供指定线程数量的线程池
   2.设置线程池的属性(需要在接口的实现类(子类的引用指向父类对象需要强转)中修改属性)
   3.执行指定的线程操作，需要提供实现Runnable接口或Callable接口实现类的对象
 */

class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        //子类的引用指向父类对象需要强转
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        // 设置线程池的属性(需要在接口的实现类中修改属性)
        service1.setCorePoolSize(15);

        service.execute(new NumberThread());//适合使用于Runnable
        service.execute(new NumberThread1());//适合使用于Runnable
        //service.submit();//适合适用于Callable

        service.shutdown();
    }
}
