package com.xuanxiao.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9090,32123,543,21,3,23};
        System.out.println(a);
        Arrays.sort(a);
        Arrays.fill(a,2,4,0);// 数组填充
        System.out.println(Arrays.toString(a));
        //printArray(a);
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i==0){
                System.out.print("[");
            }
            if (i==a.length-1){
                System.out.print(a[i]+"]");
            }else {
                System.out.print(a[i]+", ");
            }

        }
    }
}
