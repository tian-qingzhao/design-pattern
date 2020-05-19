package com.tqz.pattern.factory.factorymethod;

/**
 * @Author: tian
 * @Date: 2020/4/5 16:41
 * @Desc:
 */
public class PythonCourseFactory implements ICourseFactory{

    public ICourse create() {
        return new PythonCourse();
    }
}
