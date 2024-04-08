package com.wsz.designed.principle.singleresponsibility;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        JavaProgrammer programmer = new JavaProgrammer();
        Order order = new Order();
        programmer.setOrder(order);
        programmer.eat();
        programmer.work();
        programmer.sleep();
    }
}
