package com.wsz.designed.pattern.creational.builder;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc
 */
public class Engineer {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car makeCar(String basePlate, String frame, String door){
        carBuilder.buildBasePlate(basePlate);
        carBuilder.buildFrame(frame);
        carBuilder.buildDoor(door);
        return carBuilder.makeCar();
    }
}
