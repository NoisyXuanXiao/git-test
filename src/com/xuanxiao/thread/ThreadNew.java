package com.xuanxiao.thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
   创建线程的方式三：实现Callable接口。
   1.创建一个实现Callable的实现类
   2.实现call()方法，将此线程需要执行的操作声明在call()中
   3.创建Callable接口的实现类对象
   4.将次Callable接口的实现类对象作为传递到FutureTask构造器中，创建FutureTask的对象
   5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
   6.获取Callable中call()方法的返回值
 */

class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0){
                System.out.println(i);
                sum +=i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);

        new Thread(futureTask).start();

        try {
            // get方法的返回值即为futureTask构造器参数callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
