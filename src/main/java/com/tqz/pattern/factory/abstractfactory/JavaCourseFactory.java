package com.tqz.pattern.factory.abstractfactory;

/**
 * @Author: tian
 * @Date: 2020/4/6 21:48
 * @Desc:
 */
public class JavaCourseFactory implements ICourseFactory{

    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
