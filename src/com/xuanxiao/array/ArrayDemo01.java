package com.xuanxiao.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = i+1;
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
