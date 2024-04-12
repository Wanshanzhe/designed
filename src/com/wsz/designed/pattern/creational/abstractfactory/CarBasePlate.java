package com.wsz.designed.pattern.creational.abstractfactory;

/**
 * @author 完善者
 * @date 2024/4/12
 * @desc
 */
public class CarBasePlate extends CarBasePlateFactory {
    @Override
    public void make() {
        System.out.println("制作底盘");
    }
}
