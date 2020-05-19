package com.tqz.pattern.delegate.simple;

/**
 * @Author: tian
 * @Date: 2020/4/21 21:55
 * @Desc:
 */
public class EmployeeB implements Employee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我开始干活了，擅长后台，执行" + command);
    }
}
