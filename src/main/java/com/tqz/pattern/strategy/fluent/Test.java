package com.tqz.pattern.strategy.fluent;

/**
 * @Author: tian
 * @Date: 2020/4/22 0:46
 * @Desc: fluent风格写法
 */
public class Test {

    public static void main(String[] args) {
        new Student()
                .setId(1)
                .setUserName("tian")
                .setUserPass("123456");
    }
}
