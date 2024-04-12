package com.wsz.designed.pattern.creational.abstractfactory;

/**
 * @author 完善者
 * @date 2024/4/12
 * @desc
 */
public interface CarFactory {

    // 获取车门对象
    public CarDoor getCarDoor();

    // 获取车架对象
    public CarFrame getCarFrame();

    // 获取底盘对象
    public CarBasePlate getCarBasePlate();

    public void make();

}
