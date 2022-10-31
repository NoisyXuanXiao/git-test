package com.xuanxiao.oop.demo06;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("StudentRun");
    }

    public void go(){
        System.out.println("StudentGo");
    }

    public void eat(){
        System.out.println("StudentEat");
    }
}
