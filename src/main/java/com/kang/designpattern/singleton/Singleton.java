package com.kang.designpattern.singleton;

/**
 * 单例模式：双检索
 *
 * @author weikang.di
 * @date 2021/10/13 16:50
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    private static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
