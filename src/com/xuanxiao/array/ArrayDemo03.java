package com.xuanxiao.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println("=============");

        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("sum="+sum);

        // 查找最大元素
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println("max="+max);
    }
}
