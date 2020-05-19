package com.tqz.pattern.template.course;

/**
 * @Author: tian
 * @Date: 2020/4/23 15:41
 * @Desc:
 */
public class BigDataCourse extends NetworkCourse {

    private boolean neetHomewrok = false;

    public BigDataCourse(boolean neetHomewrok) {
        this.neetHomewrok = neetHomewrok;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查大数据课程。。。。。。");
    }

    @Override
    protected boolean needHomework() {
        return this.neetHomewrok;
    }
}
