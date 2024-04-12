package com.wsz.designed.pattern.creational.factorymethod;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Course javaCourse = javaCourseFactory.getCourse();
        javaCourse.make();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        Course pythonCourse = pythonCourseFactory.getCourse();
        pythonCourse.make();
    }
}
