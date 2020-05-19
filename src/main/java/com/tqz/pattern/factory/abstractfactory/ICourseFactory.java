package com.tqz.pattern.factory.abstractfactory;

/**
 * @Author: tian
 * @Date: 2020/4/6 21:42
 * @Desc: 要求所有的子工厂都实现这个工厂
 */
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
