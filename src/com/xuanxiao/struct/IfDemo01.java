package com.xuanxiao.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容：");
        String s = scanner.nextLine();

        if ("Hello".equals(s)){
            System.out.println(s);
        }

        System.out.println("End");

        scanner.close();
    }
}
