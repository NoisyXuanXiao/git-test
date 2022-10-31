package com.xuanxiao.base;

public class Demo06 {
    public static void main(String[] args) {
        // 操作比较大的时候注意溢出问题
        // JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total1 = money*years;// -1474836480,计算的时候溢出了
        long total2 = money*years;// 默认是int，转换之前就存在问题了
        long total3 = money*((long)years);// 先把一个数转换为long 就可以
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
}