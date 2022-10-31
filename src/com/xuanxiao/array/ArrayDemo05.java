package com.xuanxiao.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    // 打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
