package com.wsz.designed.principle.composititionaggregation;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc 合成复用原则
 */
public class Test {
    public static void main(String[] args) {
//        Teacher teacher = new Teacher();
//        teacher.call();
//        Student student = new Student();
//        student.notifyMeeting();
//        Parent parent = new Parent();
//        parent.meeting();

        //可以采用微信或电话的方式，通知家长，开家长会
        //而不用通过学生进行转达
        Teacher teacher = new Teacher();
        WxNotify wxNotify = new WxNotify();
        teacher.setNotify(wxNotify);
        Parent parent = new Parent();
        wxNotify.setParent(parent);
        teacher.call();
    }
}
