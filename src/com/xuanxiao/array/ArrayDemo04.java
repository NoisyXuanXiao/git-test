package com.xuanxiao.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        for (int array : arrays) {
            System.out.println(array);
        }
        System.out.println("==================");
        printArray(arrays);
        System.out.println("==================");
        int[] revers = revers(arrays);
        printArray(revers);
    }

    // 打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]+" ");
        }
    }

    // 反转数组
    public static int[] revers(int[] arrays){
        int[] result = new int[arrays.length];

        for (int i = 0, j = result.length-1; i < result.length; i++,j--) {
            result[j] = arrays[i];
        }
        return  result;
    }
}
