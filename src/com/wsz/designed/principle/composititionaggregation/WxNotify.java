package com.wsz.designed.principle.composititionaggregation;

/**
 * @author 完善者
 * @date 2024/4/10
 * @desc
 */
public class WxNotify implements Notify {

    private Parent parent;

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void wxNotify() {
        parent.meeting();
    }
}
