package com.xuanxiao.struct;

public class ContinueDemo {
    public static void main(String[] args) {
        int i =0;
        while (i<100){
            i++;
            if (i%10==0){
                System.out.println();
                continue;
            }
            System.out.print(i);
        }
        fun();
        // break在任何循环的主题部分均可使用，用于强制退出循环，不执行循环中的剩余语句
        // continue语句在循环语句中，用于终止某次循环，即跳过循环中尚未执行的语句，接着进行下一次循环
    }

    public static void fun(){
        for (int i = 0; i < 10; i++) {
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("aaa");
    }
}
