package com.wsz.designed.pattern.creational.simplefactory;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
//        Course javaCourse = factory.getCourse("java");
//        javaCourse.make();

        Course pythonCourse = factory.getCourse("python");
        pythonCourse.make();

    }
}
