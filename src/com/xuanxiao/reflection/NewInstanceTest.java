package com.xuanxiao.reflection;

import org.junit.Test;

public class NewInstanceTest {

    @Test
    public void test() throws Exception{

        Class clazz = Person.class;
        /*
        newInstance():调用此方法，创建对应的运行时类的对象。
        该方法内部调用了运行时类的空参构造器。并不是没使用构造器。
        要想此方法能够正常创建运行时类的对象，要求：
          1.运行时类必须提供空参构造器。
          2.空参的构造器的访问权限得够，通常设为public。

        在javabean中要求提供一个public的空参构造器，原因：
        1.便于通过反射，创建运行时类的对象。
        2.便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器。
        */
        Object obj = clazz.newInstance();
        System.out.println(obj);

    }

}
