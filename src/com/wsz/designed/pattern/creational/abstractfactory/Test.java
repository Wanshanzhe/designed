package com.wsz.designed.pattern.creational.abstractfactory;

/**
 * @author 完善者
 * @date 2024/4/12
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.getCarDoor();
        car.getCarFrame();
        car.getCarBasePlate();
        car.make();
    }
}
