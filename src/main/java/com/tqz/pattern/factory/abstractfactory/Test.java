package com.tqz.pattern.factory.abstractfactory;

import com.tqz.pattern.factory.factorymethod.ICourse;
import com.tqz.pattern.factory.simplefactory.CourseFactory;

/**
 * @Author: tian
 * @Date: 2020/4/5 16:28
 * @Desc: 抽象工厂模式：是指提供一个创建一系列相关或相互依赖对象的接口，无须指定他们具体的类。（属于创建型设计模式）
 *
 *        抽象工厂不符合开闭原则（慎用抽象工厂设计模式）
 */
public class Test {

    public static void main(String[] args) {

        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createCourse().study();
        javaCourseFactory.createNote().note();
        javaCourseFactory.createVideo().look();

        System.out.println("============================");
        
        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createCourse().study();
        pythonCourseFactory.createNote().note();
        pythonCourseFactory.createVideo().look();
    }
}
