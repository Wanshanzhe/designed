package com.wsz.designed.pattern.creational.factorymethod;

/**
 * @author 完善者
 * @date 2024/4/12
 * @desc
 */
public class PythonCourseFactory extends CourseFactory{
    @Override
    public Course getCourse() {
        return new PythonCourse();
    }
}
