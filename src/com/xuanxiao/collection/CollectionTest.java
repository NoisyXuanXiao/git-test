package com.xuanxiao.collection;

import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"aa","bb"});
        System.out.println(list);//[aa, bb]

        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1);//[[I@15aeb7ab]

        List arr2 = Arrays.asList(new Integer[]{789,1011});
        System.out.println(arr2);//[789, 1011]


    }

}
