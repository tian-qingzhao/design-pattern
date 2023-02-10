package com.tqz.pattern.proxy.dbroute;

/**
 * @Author: tian
 * @Date: 2020/4/19 23:41
 * @Desc:
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
