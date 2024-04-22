package com.wsz.designed.pattern.creational.singleton.lasy;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc
 */
public class Run implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
