package com.tqz.pattern.adapter.loginadapter.v2.adapters;

import com.tqz.pattern.adapter.loginadapter.ResultMsg;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:14
 * @Desc:
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
