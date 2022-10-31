package com.xuanxiao.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        // 输出1到1000能被5整除的数，并且每行输出3个
        for (int i = 0; i < 1000; i++) {
            if (i%5==0){
                // 输出完不换行
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                // 输出完会换行
                System.out.println();
            }
        }

    }
}
