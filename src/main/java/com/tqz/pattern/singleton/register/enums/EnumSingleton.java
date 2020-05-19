package com.tqz.pattern.singleton.register.enums;

/**
 * @Author: tian
 * @Date: 2020/4/16 16:16
 * @Desc: 枚举类型的，属于饿汉式单例，线程安全的，如果有反射破坏单例，jdk直接抛出了异常
 *
 *       Constructor.newInstance()方法里面，做了这样一个判断，是抽象类或者是枚举类型的
 *       if ((clazz.getModifiers() & Modifier.ENUM) != 0)
 *             throw new IllegalArgumentException("Cannot reflectively create enum objects");
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
