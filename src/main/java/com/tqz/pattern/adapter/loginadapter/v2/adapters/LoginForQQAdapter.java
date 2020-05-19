package com.tqz.pattern.adapter.loginadapter.v2.adapters;

import com.tqz.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:15
 * @Desc:
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
