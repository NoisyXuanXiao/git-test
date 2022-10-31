package com.xuanxiao.operator;

public class Demo06 {
    public static void main(String[] args) {

        //位运算 与二进制相关
        /*
        A = 0011 1100
        B = 0000 1101

        A&B 0000 1100  &: 两个都为1才为1 否则为0
        A|B 0011 1101  |: 有一个为1就是1
        A^B 0011 0001  ^: 相同为0 不相同是1 （异或）
        ~B  1111 0010  ~: 完全取反

        <<左移  ==  *2
        >>右移  ==  /2
        位运算效率更高

        2: 0000 0010
        3: 0000 0011
        8: 0000 1000
        */

        System.out.println(2<<3);
    }
}
