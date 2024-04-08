package com.wsz.designed.principle.interfacesegrefation;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public class Student implements EatActon, SleepAction {
    @Override
    public void eat() {
        System.out.println("学生在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生在休息");
    }
}
