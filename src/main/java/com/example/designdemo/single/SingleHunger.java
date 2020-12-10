package com.example.designdemo.single;

/**
 * 饿汉
 * 是否 Lazy 初始化：否
 *
 * 是否多线程安全：是
 *
 * 实现难度：易
 */
public class SingleHunger {

    private static SingleHunger singleHunger = new SingleHunger();

    private SingleHunger() {
    }

    public static SingleHunger getInstance() {
        return singleHunger;
    }

}
