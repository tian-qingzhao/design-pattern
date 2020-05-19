package com.tqz.pattern.decorator.passport.upgrade;

import com.tqz.pattern.decorator.passport.old.ISigninService;
import com.tqz.pattern.decorator.passport.old.ResultMsg;

/**
 * @Author: tian
 * @Date: 2020/4/22 23:57
 * @Desc:
 */
public class SiginForThirdServiceImpl implements ISiginForThirdService {

    private ISigninService signinService;

    public SiginForThirdServiceImpl(ISigninService signinService) {
        this.signinService = signinService;
    }

    public ResultMsg regist(String username, String password) {
        return signinService.regist(username,password);
    }

    public ResultMsg login(String username, String password) {
        return signinService.login(username,password);
    }

    public ResultMsg loginForQQ(String id) {
        return null;
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
