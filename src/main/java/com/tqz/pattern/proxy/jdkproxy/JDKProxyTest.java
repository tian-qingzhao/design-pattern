package com.tqz.pattern.proxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * @Author: tian
 * @Date: 2020/4/19 21:35
 * @Desc: jdk动态代理要求目标类必须实现接口
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            Object obj = new JdkMeiPo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);

            //obj.findLove();

            //$Proxy0
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
