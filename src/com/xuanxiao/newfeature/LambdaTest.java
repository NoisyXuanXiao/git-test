package com.xuanxiao.newfeature;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaTest {

    @Test
    public void test1(){

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱你xx");
            }
        };
        r1.run();

        System.out.println("***********************");

        Runnable r2 = () -> System.out.println("我也爱你xxx");
        r2.run();

    }

    @Test
    public void test2(){

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = com1.compare(12,21);
        System.out.println(compare1);

        System.out.println("***********************");
        //Lambda表达式的写法
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
        int compare2 = com2.compare(32,21);
        System.out.println(compare2);

        System.out.println("***********************");
        //方法引用的写法
        Comparator<Integer> com3 = Integer :: compare;
        int compare3 = com3.compare(21,21);
        System.out.println(compare3);

    }

    @Test
    public void test3(){
        ArrayList<String> strings = new ArrayList<>();
        strings.stream();

    }

}
