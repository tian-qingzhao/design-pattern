package com.tqz.pattern.observer.advice;

/**
 * @Author: tian
 * @Date: 2020/4/23 1:06
 * @Desc:
 */
public class TestQuestion {

    public static void main(String[] args) {
        Csdn csdn = Csdn.getInstance();
        Teacher tian = new Teacher("tian");

        Question question = new Question("xiaoming", "jdk动态代理怎么实现的？");
        //相当于 @ 某一个人
        csdn.addObserver(tian);
        csdn.publishQuestion(question);
    }
}
