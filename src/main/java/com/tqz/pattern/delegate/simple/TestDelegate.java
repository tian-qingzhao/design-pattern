package com.tqz.pattern.delegate.simple;

/**
 * @Author: tian
 * @Date: 2020/4/21 21:58
 * @Desc:
 */
public class TestDelegate {

    public static void main(String[] args) {
        new Boss().command("后台",new Leader());
    }
}
