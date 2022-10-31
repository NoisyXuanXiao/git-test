package com.xuanxiao.array;

public class ArrayDemo08 {
    public static void main(String[] args) {
        // 1.创建一个二位数组 0：没有棋子 1：黑旗 2：白棋
        int[][] array1 = new int[11][11];

        array1[1][2] = 1;
        array1[2][3] = 2;

        for (int[] ints : array1){
            for(int anInt  : ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

        // 转化为稀疏数组保存
        // 获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数："+sum);

        // 2.创建一个稀疏数组的数组
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;
        
        // 遍历二维数组，将非0的值，存放在稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i][j]!=0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }

        // 输出稀疏数组
        System.out.println("稀疏数组：");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]);
        }

        System.out.println("还原");
        // 读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        
        // 给其他元素还原它的值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        for (int[] ints : array3){
            for(int anInt  : ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

    }
}
