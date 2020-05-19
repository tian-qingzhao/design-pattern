package com.tqz.pattern.factory.factorymethod;

/**
 * @Author: tian
 * @Date: 2020/4/5 16:28
 * @Desc: 工厂方法模式：是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，
 *                   工厂方法让类的实例化推迟到子类中进行。（属于创建型设计模式）
 */
public class Test {

    public static void main(String[] args) {
        ICourseFactory courseFactory = new PythonCourseFactory();
        ICourse iCourse = courseFactory.create();
        iCourse.study();
    }
}
