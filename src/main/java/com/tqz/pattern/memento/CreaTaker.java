package com.tqz.pattern.memento;

/**
 * <p>管理者
 *
 * @author tianqingzhao
 * @since 2023/2/8 16:12
 */
public class CreaTaker<T> {
    
    private T data;
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
