package com.wsz.designed.pattern.creational.prototype;

/**
 * @author 完善者
 * @date 2024/4/22
 * @desc 原型设计模式
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
//        Pig peki = new Pig();
//        peki.setName("佩奇");
//        peki.setDoSomething("喜欢吃蛋糕");
//        System.out.println(peki);
//
//        Pig george = new Pig();
//        george.setName("乔治");
//        george.setDoSomething("喜欢睡觉");
//        System.out.println(george);
//
//        Pig pigDad = new Pig();
//        pigDad.setName("猪爸爸");
//        pigDad.setDoSomething("喜欢开车");
//        System.out.println(pigDad);
//
//        Pig pigMom = new Pig();
//        pigMom.setName("猪妈妈");
//        pigMom.setDoSomething("喜欢做饭");
//        System.out.println(pigMom);

        //使用原型设计模式创建对象
        Pig peki = new Pig();
        peki.setName("佩奇");
        peki.setDoSomething("喜欢吃蛋糕");
        System.out.println(peki);

        Pig george = (Pig) peki.clone();
        george.setName("乔治");
        george.setDoSomething("喜欢睡觉");
        System.out.println(george);

    }

}
