package com.xuanxiao.oop.demo01;

public class Demo05 {
    public static void main(String[] args) {
        // 引用传递：对象本质还是值传递
        Person person = new Person();
        System.out.println(person.name);
        Demo05.change(person);
        System.out.println(person.name);
    }

    public static void change(Person person){
        person.name = "sun";
    }
}

class Person{
    String name;
}
