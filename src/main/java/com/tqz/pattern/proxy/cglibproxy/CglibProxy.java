package com.tqz.pattern.proxy.cglibproxy;

import com.tqz.pattern.proxy.dbroute.db.DynamicDataSourceEntity;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @Author: tian
 * @Date: 2020/4/19 21:32
 * @Desc:
 */
public class CglibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        //相当于Proxy，代码生成工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(clazz);
        //回调当前对象
        enhancer.setCallback(this);
        //把创建好的对象返回去
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        //因为cglib是新生成的类继承了目标类，所以要调用super
        Object value = methodProxy.invokeSuper(o,objects);
        after();
        return value;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
