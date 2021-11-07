package com.kang.designpattern.singleton;

/**
 * @author weikang.di
 * @date 2021/10/13 17:02
 */
public class Singleton2 {

    private static class SingletonInstance {
        private static final Singleton2 instance = new Singleton2();
    }

    private Singleton2() {
    }

    private static Singleton2 getInstance() {
        return SingletonInstance.instance;
    }
}
