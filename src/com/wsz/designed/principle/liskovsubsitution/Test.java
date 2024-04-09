package com.wsz.designed.principle.liskovsubsitution;

/**
 * @author 完善者
 * @date 2024/4/9
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("1+2=" + teacher.fun1(1, 2));

        Student student = new Student();
        System.out.println("1+2=" + student.fun1(1, 2));
        System.out.println("1+2=" + student.fun2(1, 2));
        student.setTeacher(teacher);
        System.out.println("1+2=" + student.fun3(1, 2));

    }
}
