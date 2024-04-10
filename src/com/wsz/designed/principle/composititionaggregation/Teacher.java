package com.wsz.designed.principle.composititionaggregation;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc
 */
public class Teacher {

    private Notify notify;

    public void setNotify(Notify notify) {
        this.notify = notify;
    }

    public void call() {
//        System.out.println("小明，通知你的家长，，在这周末开家长会！");
        if (notify instanceof WxNotify) {
            System.out.println("使用微信通知家长！");
            ((WxNotify) notify).wxNotify();
        } else if (notify instanceof PhoneNotify) {
            System.out.println("使用电话通知家长！");
            ((PhoneNotify) notify).phoneNotify();
        }
    }
}
