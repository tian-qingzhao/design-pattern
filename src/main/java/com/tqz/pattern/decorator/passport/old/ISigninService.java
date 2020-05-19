package com.tqz.pattern.decorator.passport.old;

/**
 * @Author: tian
 * @Date: 2020/4/22 23:57
 * @Desc: 
 */
public interface ISigninService {
    ResultMsg regist(String username, String password);


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
