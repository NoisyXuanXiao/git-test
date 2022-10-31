package com.xuanxiao.operator;

public class Demo08 {
    public static void main(String[] args) {
        // x ? y : z
        // 如果x等于true则结果为y 夫走结果为z

        int score  = 80;
        String type = score < 60 ? "不及格" : "及格";
        System.out.println(type);

    }
}
