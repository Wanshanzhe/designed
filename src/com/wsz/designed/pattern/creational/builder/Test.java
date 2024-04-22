package com.wsz.designed.pattern.creational.builder;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc 建造者模式
 */
public class Test {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        // 创建工程师
        Engineer engineer = new Engineer();
        engineer.setCarBuilder(carBuilder);

        Car car = engineer.makeCar("制作汽车底盘", "制作汽车车架", "制作汽车车门");
        System.out.println(car);

    }
}
