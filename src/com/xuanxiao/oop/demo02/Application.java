package com.xuanxiao.oop.demo02;

public class Application {
    public static void main(String[] args) {

        // 实例化一个对象
        Person person = new Person("xuanxiao");
        System.out.println(person.name);
    }
}

/*
        // 类：抽象的，实例化
        Student xiaoming = new Student();
        Student xiaohong = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        xiaohong.name = "小红";
        xiaohong.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);
 */
