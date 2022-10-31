package com.xuanxiao.commonclass;

import org.junit.Test;

/*
   String的使用
 */
public class StringTest {
    /*
       String:字符串使用一对""引起来表示
       1.String声明为final，不可被继承
       2.String实现了Serializable接口：表示字符串是支持序列化的。
               实现了Comparable接口：表示字符串可以比较大小
       3.String内部定义了final char[] value 用于存储字符串数据
       4.String：代表不可变的字符序列，简称不可变性。
         体现：1.当对字符串重新赋值时，需要重新指定内存区域，不能使用原有的value进行赋值。
              2.当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
              3.当调用String的replace()方法修改指定的字符或字符串时，也需要重新指定内存区域赋值。
       5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中。
       6.字符串常量池中是不会存储相同内容的字符串的。

     */
    @Test
    public void test1(){
        String s1 = "abc";//字面量
        String s2 = "abc";
        //s1 = "hello";

        System.out.println(s1==s2);

        System.out.println(s1);
        System.out.println(s2);
    }

    /*
       String实例化方式
       方式一：通过字面量定义的方式
          通过字面量定义的方式：此时s1和s2的数据javaee声明在方法区的字符串常量池中
       方式二：通过new+构造器的方式
          通过new+构造器的方式：此时s3和s4保存的地址值，数据在堆空间中开辟空间以后对应的地址

       String s = new String("abc");该方式创建对象，在内存中创建了几个对象。
       两个：一个是堆空间中new结构，另一个是char[]对应的常量池中的数据"abc"
     */
    @Test
    public void test2(){
        // 通过字面量定义的方式：此时s1和s2的数据javaee声明在方法区的字符串常量池中
        String s1= "javaEE";
        String s2= "javaEE";
        // 通过new+构造器的方式：此时s3和s4保存的地址值，数据在堆空间中开辟空间以后对应的地址
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s3==s4);//false

    }

    /*
       字符串拼接
       1.常量与常量的拼接结果在常量池，且常量池中不会存在相同内容的常量。
       2.只要其中有一个是变量，结果就在堆中。
       3.如果拼接的结果调用intern()方法，返回值就在常量池中。
     */
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE"+"hadoop";
        String s5 = s1+"hadoop";
        String s6 = "javaEE"+s2;
        String s7 = s1+s2;

        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
        System.out.println(s3==s7);//false
        System.out.println(s5==s6);//false
        System.out.println(s5==s7);//false
        System.out.println(s6==s7);//false
    }

}

class StringTest2{

    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str,char[] ch){
        // 此处因为Sting字符串的不可变性，更改值的时候重新指定内存区域，原有value不变
        str = "test ok";
        // 该char型数组的引用地址传进来，改变了数组对象，所有输出的时候值改变了
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest2 stringTest2 = new StringTest2();
        stringTest2.change(stringTest2.str,stringTest2.ch);
        System.out.println(stringTest2.str);
        System.out.println(stringTest2.ch);
    }
}
