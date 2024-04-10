package com.wsz.designed.pattern.creational.simplefactory;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc
 */
public class JavaCourse extends Course {
    @Override
    public void make() {
        System.out.println("制作java课程");
    }
}
