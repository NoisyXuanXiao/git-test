package com.xuanxiao.operator;

public class Demo04 {
    public static void main(String[] args) {
        // ++ -- 自增 自减
        int a = 3;
        int b = a++; // 先给b赋值 a再自增
        System.out.println(a);
        int c = ++a; // a先自增 再给b赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 幂运算 通过Math工具类完成
        double pow = Math.pow(3,2);
        System.out.println(pow);
    }
}
