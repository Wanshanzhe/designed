package com.wsz.designed.principle.openclose;

/**
 * @author 完善者
 * @date 2024/4/7
 * @desc
 */
public class Student implements Human {
    @Override
    public void eat() {
        System.out.println("学生在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生在睡觉");
    }

    public void study() {
        System.out.println("学生在学习");
    }
}
