package com.tqz.pattern.strategy.fluent;

/**
 * @Author: tian
 * @Date: 2020/4/22 0:45
 * @Desc:
 */
public class Student {

    private int id;
    private String userName;
    private String userPass;

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Student setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPass() {
        return userPass;
    }

    public Student setUserPass(String userPass) {
        this.userPass = userPass;
        return this;
    }
}
