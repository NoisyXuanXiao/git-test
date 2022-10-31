package com.xuanxiao.exception;

public class Test {

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException=>"+e);
        }
    }
    // 可能存在异常的方法就加throws来申明
    static void test(int a) throws MyException {
        if (a>10){
            throw new MyException(a);// 抛出
        }
        System.out.println("OK");
    }
}
