package com.tqz.pattern.proxy.dbroute.proxy;

import com.tqz.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: tian
 * @Date: 2020/4/19 23:41
 * @Desc:
 */
public class JdkDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    Object proxyObj;

    /**
     *
     * @param clazz
     * @return
     */
    public Object getInstance(Class<?> clazz) {
        try {
            this.proxyObj = clazz.newInstance();
            return Proxy.newProxyInstance(new TqzClassLoader(),clazz.getInterfaces(),this);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxyObj,args);
        after();
        return object;
    }

    private void after() {
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    //target 应该是订单对象Order
    private void before(Object target) {
        try {
            //进行数据源的切换
            System.out.println("Proxy before method");

            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
