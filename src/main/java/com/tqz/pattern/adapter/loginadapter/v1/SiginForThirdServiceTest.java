package com.tqz.pattern.adapter.loginadapter.v1;

import com.tqz.pattern.adapter.loginadapter.v1.service.SinginForThirdService;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:13
 * @Desc: 
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
