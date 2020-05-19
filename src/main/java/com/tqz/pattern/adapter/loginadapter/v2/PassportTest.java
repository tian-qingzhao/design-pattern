package com.tqz.pattern.adapter.loginadapter.v2;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:14
 * @Desc: 结合策略模式、工厂模式、适配器模式
 *        适配器模式没有层级关系，装饰器模式有层级关系
 *        适配器和被适配器者没有必然的联系，通常是采用继承或代理的形式进行包装
 *        注重兼容、转换
 */
public class PassportTest {

    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");


    }

}
