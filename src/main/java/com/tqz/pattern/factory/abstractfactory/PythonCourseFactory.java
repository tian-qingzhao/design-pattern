package com.tqz.pattern.factory.abstractfactory;

/**
 * @Author: tian
 * @Date: 2020/4/6 22:01
 * @Desc:
 */
public class PythonCourseFactory implements ICourseFactory{

    public ICourse createCourse() {
        return new PythonCourse();
    }

    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
