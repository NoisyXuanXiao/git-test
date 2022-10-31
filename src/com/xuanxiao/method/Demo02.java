package com.xuanxiao.method;

public class Demo02 {
    public static void main(String[] args) {
        double max = max(10,20.0);
        System.out.println(max);
    }

    // 比大小
    public static int max(int num1,int num2){
        int result = 0;
        if (num1==num2){
            System.out.println("num1==num2");
            return 0;
        }
        if (num1>num2){
            result=num1;
        }else {
            result=num2;
        }

        return result;
    }

    public static double max(double num1,double num2){
        double result = 0;
        if (num1==num2){
            System.out.println("num1==num2");
            return 0;
        }
        if (num1>num2){
            result=num1;
        }else {
            result=num2;
        }

        return result;
    }

}
