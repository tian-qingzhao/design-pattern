package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:52
 */
public class Context {
    
    private int count;
    
    public Context(int count) {
        this.count = count;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
}
