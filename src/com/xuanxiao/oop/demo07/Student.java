package com.xuanxiao.oop.demo07;

public class Student {

    private static int age;
    private double score;

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);

    }
}
