package com.xuanxiao.commonclass;

import org.junit.Test;

public class StringBufferBuilderTest {
    /*
       String、StringBuffer、StringBuilder异同
       String：不可变的字符序列，底层使用char[]存储.（JDK9后用的是byte[]）
       StringBuffer：可变的字符序列；线程安全的，效率低;底层使用char[]存储.（JDK9后用的是byte[]）
       StringBuilder：可变的字符序列；线程不安全的，效率高;底层使用char[]存储.（JDK9后用的是byte[]）

       源码分析：
       String str = new String();//char[] value = new char[0];
       String str1 = new String("abc");//char[] value = new char[]{'a','b','c'}

       StringBuffer sb = new StringBuffer();//char[] value = new char[16];底层创建了一个长度是16的数组
       sb1.append('a');//value[0] = 'a';
       sb1.append('b');//value[1] = 'b';
       StringBuffer sb1 = new StringBuffer("abc");//char[] value = new char["abc".length()+16];

       问题1：System.out.println(sb1.length());//3(返回的是实际添加的值的长度)
       问题2：扩容问题：如果添加的数据底层数组盛不下了，那就需要扩容底层的数组。
             默认情况下，扩容为原来容量的两倍+2，同时将原有数组中的元素复制到新的数组中。

     */

    @Test
    public void test1(){
        String s1 = "abc";
        s1.replace('a','1');
        String s2 = s1.replace('a','1');
        System.out.println(s1);
        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("abc");
        s3.replace(0,1,"1");
        StringBuffer s4 = s3.replace(0,1,"1");
        s4.reverse();
        System.out.println(s3);
        System.out.println(s4);

    }

}
