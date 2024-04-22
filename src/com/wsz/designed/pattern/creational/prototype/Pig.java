package com.wsz.designed.pattern.creational.prototype;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc
 */
public class Pig implements Cloneable{

    private String name;
    private String doSomething;

    public Pig() {
        System.out.println("小猪被初始化了...");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pig{" + "name='" + name + '\'' + ", doSomething='" + doSomething + '\'' + '}' + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoSomething() {
        return doSomething;
    }

    public void setDoSomething(String doSomething) {
        this.doSomething = doSomething;
    }
}
