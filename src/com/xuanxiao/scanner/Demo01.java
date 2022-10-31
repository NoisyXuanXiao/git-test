package com.xuanxiao.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // 创建一个扫描器对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方法接收：");

        // 判断用户有没有输入字符串
        if (scanner.hasNext()){
            // next()方法不能输入带有空格的字符串，只会取得空格之前的内容
            String str = scanner.next(); // 程序会主动等待用户输入完毕
            System.out.println("输出的内容为："+str);
        }

        // 凡是属于IO流的类，如果不关闭会一直占用资源，要养成良好的习惯用完关掉
        scanner.close();
    }
}
