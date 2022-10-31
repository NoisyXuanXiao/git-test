package com.xuanxiao.oop.demo05;

public class A extends B{
    public void test(){
        System.out.println("A=>test()");
    }

    @Override
    public String test2(String lll) {
        return super.test2(lll);
    }
}
