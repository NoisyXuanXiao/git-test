package com.xuanxiao.oop.demo10;

public class Outer {

    private int id = 10;
    public void out(){
        System.out.println("外部类的方法");

    }

    public class Inner{
        public void in(){
            System.out.println("内部类的方法");
        }

        // 获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }

    // 局部内部类
    public void meyhod(){
        class Inner{

        }
    }
}
