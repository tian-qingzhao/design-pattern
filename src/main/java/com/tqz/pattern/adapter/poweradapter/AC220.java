package com.tqz.pattern.adapter.poweradapter;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:16
 * @Desc: 
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电流" + output + "V");
        return output;
    }
}
