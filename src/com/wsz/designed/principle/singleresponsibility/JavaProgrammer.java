package com.wsz.designed.principle.singleresponsibility;

/**
 * @author 完善者
 * @date 2024/4/8
 * @desc
 */
public class JavaProgrammer extends Programmer {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void eat() {
        order.take();
    }

    @Override
    public void sleep() {
        System.out.println("java程序员在睡觉");
    }

    @Override
    public void work() {
        System.out.println("java程序员在工作");
    }
}
