package com.wsz.designed.pattern.creational.singleton.lasy;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Thread t1  = new Thread(new Run());
        Thread t2  = new Thread(new Run());

        t1.start();
        t2.start();

        System.out.println("当前程序结束了...");

    }
}
