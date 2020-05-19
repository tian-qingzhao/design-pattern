package com.tqz.pattern.proxy.dbroute;

import com.tqz.pattern.proxy.dbroute.proxy.JdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom on 2019/3/10.
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

            order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService)new JdkDynamicProxy().getInstance(OrderService.class);
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
