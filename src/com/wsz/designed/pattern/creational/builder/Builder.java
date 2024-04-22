package com.wsz.designed.pattern.creational.builder;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc
 */
public abstract class Builder {

    public abstract void buildBasePlate(String basePlate);
    public abstract void buildFrame(String frame);
    public abstract void buildDoor(String door);

    public abstract Car makeCar();
}
