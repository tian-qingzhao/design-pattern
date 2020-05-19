package com.tqz.pattern.proxy.dbroute.proxy;

import java.lang.reflect.Method;

/**
 * @Author: tian
 * @Date: 2020/4/19 22:31
 * @Desc:  InvocationHandler接口是proxy代理实例的调用处理程序实现的一个接口，每一个proxy代理实例都有一个关联的调用处理程序；
 *         在代理实例调用方法时，方法调用被编码分派到调用处理程序的invoke方法。
 */
public interface InvocationHandler {

    /**
     *
     * proxy:代理类代理的真实代理对象com.sun.proxy.$Proxy0
     * method:我们所要调用某个对象真实的方法的Method对象
     * args:指代代理对象方法传递的参数
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
