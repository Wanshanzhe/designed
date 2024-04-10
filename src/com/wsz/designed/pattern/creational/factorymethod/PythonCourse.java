package com.wsz.designed.pattern.creational.factorymethod;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc
 */
public class PythonCourse extends Course {
    @Override
    public void make() {
        System.out.println("制作Python课程");
    }
}
