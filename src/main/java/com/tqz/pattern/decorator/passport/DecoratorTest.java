package com.tqz.pattern.decorator.passport;

import com.tqz.pattern.decorator.passport.old.SigninServiceImpl;
import com.tqz.pattern.decorator.passport.upgrade.ISiginForThirdService;
import com.tqz.pattern.decorator.passport.upgrade.SiginForThirdServiceImpl;

/**
 * @Author: tian
 * @Date: 2020/4/22 23:58
 * @Desc: 装饰器模式是一种非常特别的适配器模式
 *        装饰者和被装饰者都实现同一个接口，主要目的是为了扩展以后依旧保持OOP关系
 *        注重覆盖、扩展
 *        装饰者是继承的有力补充，比继承更灵活，不改变原有对象的情况下动态的给一个对象扩展功能，即插即用，
 *        装饰器模式完全遵循开闭原则，可以理解为一种静态代理，只不过不是增强，而是扩展。
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdServiceImpl(new SigninServiceImpl());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }


}
