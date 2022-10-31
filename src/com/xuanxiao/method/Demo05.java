package com.xuanxiao.method;

public class Demo05 {
    public static void main(String[] args) {
        // 递归死循环
        Demo05 demo05 = new Demo05();
        demo05.test();
    }

    public void test(){
        test();
    }
}
