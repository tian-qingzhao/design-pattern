package com.tqz.pattern.delegate.simple;

/**
 * @Author: tian
 * @Date: 2020/4/21 21:55
 * @Desc:
 */
public class EmployeeA implements Employee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始干活了，擅长前端，执行" + command);
    }
}
