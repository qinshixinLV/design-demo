package com.example.designdemo.single;

/**
 * 懒汉
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：易
 */
public class SingleLazy {

    private static SingleLazy singleLazy;

    private SingleLazy() {
    }

    public static synchronized SingleLazy getInstance() {
        if (singleLazy == null)
            singleLazy = new SingleLazy();
        return singleLazy;
    }

}
