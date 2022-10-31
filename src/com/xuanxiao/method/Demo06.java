package com.xuanxiao.method;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    // 阶乘
    // 1! 1
    // 2! 2*1
    // 5! 5*4*3*2*1
    public static int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
