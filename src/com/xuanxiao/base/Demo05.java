package com.xuanxiao.base;

public class Demo05 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;//类型转换 内存溢出

        // 自动转换  低→高
        // 强制转换  高→低 （类型）变量名

        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转为不相干的类型
        3.在高容量转为低容量的时候强制转换
        4.转换的时候可能存在内存溢出，或者精度问题
        */
        System.out.println(i);
        System.out.println(b);

        char c = 'a';
        int d = c+1;
        System.out.println(c);
        System.out.println(d);
        System.out.println((char) d);

    }
}
