package com.xuanxiao.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        // 大于60及格，小于60不及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score = scanner.nextInt();

        if (score>60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }

        scanner.close();
    }
}
