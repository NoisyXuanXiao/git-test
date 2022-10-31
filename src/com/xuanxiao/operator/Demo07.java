package com.xuanxiao.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a+=b; // a = a+b
        a-=b; // a = a-b
        System.out.println(a);

        // 字符串连接符
        // +号两侧 有一方出现字符串 会把另一个转化成字符串并拼接
        System.out.println(""+a+b);
        // 这种情况先运算后再拼接
        System.out.println(a+b+"");
    }
}
