package com.xuanxiao.operator;

public class Demo05 {
    public static void main(String[] args) {
        // 逻辑运算符
        boolean a = true;
        boolean b = false;

        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!(a&&b));

        // 短路运算符
        int c = 5;
        boolean d = (c<4)&&(c++<4);
        System.out.println(c);
        System.out.println(d);
    }
}
