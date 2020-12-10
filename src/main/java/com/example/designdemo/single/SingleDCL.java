package com.example.designdemo.single;

/**
 * 双重校验
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 */
public class SingleDCL {

    private static volatile SingleDCL singleDCL;

    private SingleDCL() {
    }

    public static SingleDCL getInstance() {
        if (singleDCL == null) {
            synchronized (SingleDCL.class) {
                if (singleDCL == null)
                    singleDCL = new SingleDCL();
            }
        }
        return singleDCL;
    }

}
