package com.xuanxiao.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1;
        while (a<=100){
            System.out.println(a);
            a += 2;
        }
        System.out.println("while循环结束");

        // idea快捷键 100.for
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }
        System.out.println("for循环结束");


    }
}
