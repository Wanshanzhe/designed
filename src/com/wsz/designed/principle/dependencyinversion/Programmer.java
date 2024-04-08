package com.wsz.designed.principle.dependencyinversion;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public abstract class Programmer implements Human {
    @Override
    public void eat() {
        System.out.println("程序员在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("程序员在睡觉");
    }

    /**
     * 抽象类可以定义一个抽象方法
     */
    public abstract void work();
}
