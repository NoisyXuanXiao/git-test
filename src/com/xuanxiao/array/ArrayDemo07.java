package com.xuanxiao.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        // 冒泡排序
        int[] a = {1,5,5,6,2,7,4};
        int[] sort = sort(a);

        System.out.println(Arrays.toString(a));

    }

    public static int[] sort(int[] array){
        int temp = 0;
        // 外层循环判断我们走多少次
        for (int i = 0; i < array.length-1; i++) {
            // 内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j+1]>array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
