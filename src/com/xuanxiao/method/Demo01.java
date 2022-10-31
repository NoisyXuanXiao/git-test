package com.xuanxiao.method;

public class Demo01 {
    public static void main(String[] args) {
        // 实际参数，实际调用传递给他的参数
        int sum = add(1,2);
        System.out.println(sum);

        //test();
    }

    // 加法
    // 形式参数，用来定义作用的
    public static int add(int a, int b){
        return a+b;
    }

    public static void test(){
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
