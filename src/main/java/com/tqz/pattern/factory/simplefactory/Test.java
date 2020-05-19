package com.tqz.pattern.factory.simplefactory;

/**
 * @Author: tian
 * @Date: 2020/4/5 16:10
 * @Desc: 简单工厂：是指由一个工厂对象决定创建出哪一种产品类的实例。属于创建型模式，但他不属于GOF23中设计模式。
 *              优点：只需要传入一个正确的参数，就可以获取所需要的对象，无须知道其创建的细节
 *              缺点：工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则。
 *                   不易于扩展过于复杂的产品结构。
 */
public class Test {

    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.study();

        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.createCourse(JavaCourse.class);
        ICourse course1 = courseFactory.createCourse(PythonCourse.class);
        course.study();
        course1.study();
    }
}
