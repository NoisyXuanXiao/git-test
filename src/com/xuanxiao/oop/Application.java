package com.xuanxiao.oop;

import com.xuanxiao.oop.demo06.Person;
import com.xuanxiao.oop.demo06.Student;
import com.xuanxiao.oop.demo06.Teacher;
import com.xuanxiao.oop.demo08.A;
import com.xuanxiao.oop.demo08.Action;
import com.xuanxiao.oop.demo10.Outer;

public class Application {
    public static void main(String[] args) {

        //Student s1 = new Student();
        //s1.test("孙雨轩");
        //s1.test1();

        //Person s2 = new Student();
        //s2.print();
        //System.out.println(s2.name);

        //===========================================
        //A a = new A();
        //a.test();

        //B b = new A();
        // test是静态方法调用的是父类B的方法
        // test是实例方法时调用的是子类A实例的方法
        //b.test();

        //===========================================

        // Student 能调用的方法都是自己的或者继承父类的
        //Student s1 = new Student();
        // Person 父类型可以指向子类，但是不能调用子类独有的方法
        //Person s2 = new Student();
        //Object s3 = new Student();

        // 子类没有重写时调用的都是父类方法，重写后调用都是子类
        //s2.run();
        //s1.run();

        // 子类独有方法子类引用可以调用，父类引用不可以，想要调用需要强转
        //s1.eat();
        //((Student) s2).eat();

        //===========================================

        //Object object= new Student();
        //System.out.println(object instanceof Student);//true
        //System.out.println(object instanceof Person);//true
        //System.out.println(object instanceof Object);//true
        //System.out.println(object instanceof Teacher);//false
        //System.out.println(object instanceof String);//false

        //System.out.println("==============================");

        //Person person= new Student();
        // 子类独有方法子类引用可以调用，父类引用不可以，想要调用需要强转
        //((Student) person).go();

        //System.out.println(person instanceof Student);//true
        //System.out.println(person instanceof Person);//true
        //System.out.println(person instanceof Object);//true
        //System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错

        //System.out.println("==============================");

        //Student student= new Student();
        //System.out.println(student instanceof Student);//true
        //System.out.println(student instanceof Person);//true
        //System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(person instanceof String);//编译报错

        //Action a = new A();

        Outer outer = new Outer();

        // 通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.getID();
    }
}
