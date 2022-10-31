package com.xuanxiao.base;

public class Demo08 {

    // 类变量 static
    static double salary = 2500;

    // 属性:变量

    // 实例变量：从属于对象
    // 不自行初始化 int默认是0 double默认是0.0 布尔型默认是false
    // 除了基本类型，其余默认值都是null
    String name;
    int age;
    double num;

    // main方法
    public static void main(String[] args) {
        // 局部变量，必须声明和初始化
        int i=10;
        System.out.println(i);

        // 变量类型 变量名字 = new。。。
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);
        System.out.println(demo08.name);
        System.out.println(demo08.num);

        System.out.println(salary);
    }

    // 其他方法
    public void add(){

    }
}
