package com.xuanxiao.thread;

/*
   单例设计模式：
   1.所谓单例设计模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例
   2.饿汉式和懒汉式
   3.区分饿汉式和懒汉式
     饿汉式：坏处：对象加载时间过长 好处：饿汉式是线程安全的
     懒汉式：好处：延迟对象创建    坏处：目前写法， 懒汉式线程不安全
 */
public class SingletonTest {

    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1==bank2);//true

        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1==order2);//true
    }
}

// 饿汉式
class Bank{
    // 1.私有化构造器
    private Bank(){

    }

    // 2.内部创建类的对象
    // 4.要求此对象也必须是静态的
    private static Bank instance = new Bank();

    // 3.提供公共的方法返回类的对象
    public  static Bank getInstance(){
        return instance;
    }
}

// 懒汉式
class Order{
    // 1.私有化构造器
    private Order(){

    }

    // 2.声明当前类的对象
    private static Order instance = null;

    // 3. 声明一个public,static的返回当前类对象的方法
    // 使用synchronized修饰符确保它成为一个同步方法，确保线程安全
    public static synchronized Order getInstance(){
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}
