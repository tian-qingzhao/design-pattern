package com.tqz.pattern.observer.advice;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: tian
 * @Date: 2020/4/23 1:04
 * @Desc:
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Csdn gper = (Csdn)o;
        Question question = (Question)arg;
        System.out.println("===============================");
        System.out.println(teacherName + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}