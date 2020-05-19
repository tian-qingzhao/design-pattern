package com.tqz.pattern.delegate.simple;

/**
 * @Author: tian
 * @Date: 2020/4/21 21:45
 * @Desc: 老板下达命令
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
