package com.wsz.designed.principle.dependencyinversion;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public class JavaProgrammer extends Programmer {

    @Override
    public void eat() {
        System.out.println("java程序员在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("java程序员在睡觉");
    }

    @Override
    public void work() {
        System.out.println("java程序员在工作");
    }
}
