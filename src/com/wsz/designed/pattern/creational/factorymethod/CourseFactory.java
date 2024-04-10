package com.wsz.designed.pattern.creational.factorymethod;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc
 */
public class CourseFactory {

    public Course getCourse(String course) {
        if ("java".equalsIgnoreCase(course)) {
            // 创建java课程对象
            return new JavaCourse();
        } else if ("python".equalsIgnoreCase(course)) {
            // 创建python课程对象
            return new PythonCourse();
        }
        return null;
    }
}
