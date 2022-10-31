package com.xuanxiao.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        // 静态初始化
        int[] a = {1,2,3,4,5};

        System.out.println(a[0]);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        // 动态初始化，包含默认初始化
        int[] b = new int[5];
        b[0] = 1;
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
