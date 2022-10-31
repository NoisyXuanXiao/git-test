package com.xuanxiao.oop.demo05;

public class Student extends Person{

    public Student() {

        System.out.println("Student无参执行了");
    }

    public String name = "studentName";


    public void print(){

        System.out.println("Student");
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
