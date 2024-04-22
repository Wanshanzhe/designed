package com.wsz.designed.pattern.creational.builder;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc
 */
public class Car {

    private String basePlate;

    private String frame;

    private String door;

    @Override
    public String toString() {
        return "Car{" +
                "basePlate='" + basePlate + '\'' +
                ", frame='" + frame + '\'' +
                ", door='" + door + '\'' +
                '}';
    }

    public String getBasePlate() {
        return basePlate;
    }

    public void setBasePlate(String basePlate) {
        this.basePlate = basePlate;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }
}
