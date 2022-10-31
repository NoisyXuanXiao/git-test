package com.xuanxiao.base;

public class Demo04 {
    public static void main(String[] args) {

        // 浮点数拓展
        // float 有限 离散 舍入误差 大约 接近但不等于
        // 最好完全避免使用浮点数进行比较 银行类业务要用BigDecimal类

        float f =0.1f;
        double d = 1.0/10;

        // 这两个0.1并不相等
        System.out.println(f==d);

        float d1 = 23232323232323232323f;
        float d2 = d1 + 1;

        // 这两个float相等
        System.out.println(d1==d2);

        // 字符拓展

        char c1 = 'a';
        char c2 = '中';
        char c3 = '\t';
        char c4 = '\u9999';

        // 所有字符的本质还是数字
        // 通过单个字符表示字符a，A等
        // 通过转义字符表示特殊字符
        // 通过Unicode值表示字符

        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println("A"+c3+"B");
        System.out.println(c4);

        // 字符串拓展
        String sa = new String("helloworld");
        String sb = new String("helloworld");

        String sc = "helloworld";
        String sd = "helloworld";

        System.out.println(sa==sb);// 不相等
        System.out.println(sc==sd);// 相等

        // 布尔值拓展
        boolean flag = true;
        if (flag){} //老手
        if (flag==true){} //新手
    }
}
