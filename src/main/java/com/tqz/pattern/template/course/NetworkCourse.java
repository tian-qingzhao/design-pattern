package com.tqz.pattern.template.course;

/**
 * @Author: tian
 * @Date: 2020/4/23 15:15
 * @Desc:
 */
public abstract class NetworkCourse {

    protected final void createCourse(){
        //发布预习资料
        this.postPreResource();
        //发布PPT课件
        this.createPPT();
        //在线直播
        this.liveVideo();
        //提交课件、课堂笔记
        this.postNote();
        //提交源码
        this.postSource();
        //布置作业然后检查
        if (needHomework()){
            checkHomework();
        }
    }

    protected abstract void checkHomework();

    //钩子方法，可以用来控制流程
    protected boolean needHomework(){
        return false;
    }

    protected final void postSource(){
        System.out.println("提交源码。。。。。。");
    }

    protected final void postNote(){
        System.out.println("提交课件、课堂笔记。。。。。。");
    }

    protected final void liveVideo(){
        System.out.println("直播授课。。。。。。");
    }

    protected final void createPPT(){
        System.out.println("创建PPT。。。。。。");
    }

    protected final void postPreResource(){
        System.out.println("发布预习资料。。。。。。");
    }
}
