package com.tqz.pattern.factory.factorymethod;

/**
 * @Author: tian
 * @Date: 2020/4/5 16:39
 * @Desc:
 */
public class JavaCouseFactory implements ICourseFactory{

    public ICourse create() {
        return new JavaCourse();
    }
}
