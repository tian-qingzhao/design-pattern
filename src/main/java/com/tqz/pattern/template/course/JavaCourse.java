package com.tqz.pattern.template.course;

/**
 * @Author: tian
 * @Date: 2020/4/23 15:40
 * @Desc:
 */
public class JavaCourse extends NetworkCourse{

    private boolean needHomework = false;

    public JavaCourse() {
    }

    public JavaCourse(boolean needHomework) {
        this.needHomework = needHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查Java架构课程。。。。。。");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomework;
    }
}
