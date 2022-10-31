package com.xuanxiao.commonclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("123");
        list1.add(111);

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
