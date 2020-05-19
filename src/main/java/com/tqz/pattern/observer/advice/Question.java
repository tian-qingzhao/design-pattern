package com.tqz.pattern.observer.advice;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:56
 * @Desc:
 */
public class Question {

    //提问题的人
    private String userName;

    //提问题的内容
    private String content;

    public Question(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
