package com.xuanxiao.oop.demo01;

public class Demo04 {
    public static void main(String[] args) {
        // 值传递
        int a = 1;
        System.out.println(a);

        Demo04.change(a);

        System.out.println(a);
    }
    // 返回值是空
    public static void change(int a){
        a = 10;
    }
}
