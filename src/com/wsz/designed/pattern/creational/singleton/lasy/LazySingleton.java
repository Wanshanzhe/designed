package com.wsz.designed.pattern.creational.singleton.lasy;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc 单例模式-懒汉式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
