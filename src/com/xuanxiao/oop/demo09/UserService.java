package com.xuanxiao.oop.demo09;

public interface UserService {

    // 默认是public静态常量
    public static final int i = 1;

    // 默认是public抽象方法
    public abstract void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
