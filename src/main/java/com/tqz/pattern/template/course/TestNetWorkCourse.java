package com.tqz.pattern.template.course;

import sun.nio.ch.Net;

/**
 * @Author: tian
 * @Date: 2020/4/23 15:44
 * @Desc:
 */
public class TestNetWorkCourse {

    public static void main(String[] args) {
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("================================");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
