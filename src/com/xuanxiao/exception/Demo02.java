package com.xuanxiao.exception;

public class Demo02 {
    public static void main(String[] args) {

        int a = 1;
        int b =0;

        // Ctrl+Alt+t
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }


    }

}
