package com.xuanxiao.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方法接收：");

        // nextLine()方法是以回车键作为结束符
        String str  = scanner.nextLine();
        System.out.println("输出的内容为："+str);

        scanner.close();
    }
}
