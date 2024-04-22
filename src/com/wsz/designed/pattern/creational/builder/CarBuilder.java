package com.wsz.designed.pattern.creational.builder;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc
 */
public class CarBuilder extends Builder{

    private Car car = new Car();


    @Override
    public void buildBasePlate(String basePlate) {
        car.setBasePlate(basePlate);
    }

    @Override
    public void buildFrame(String frame) {
        car.setFrame(frame);
    }

    @Override
    public void buildDoor(String door) {
        car.setDoor(door);
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
