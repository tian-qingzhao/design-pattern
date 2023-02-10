package com.tqz.pattern.observer.advice;

import java.util.Observable;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:57
 * @Desc:
 */
public class Csdn extends Observable {

    private String name = "中国专业IT社区";

    private static Csdn csdn = null;

    public static Csdn getInstance(){
        if (null == csdn){
            csdn = new Csdn();
        }
        return csdn;
    }

    public String getName(){
        return this.name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提了一个问题");
        setChanged();
        //告诉观察者
        notifyObservers(question);
    }
}
