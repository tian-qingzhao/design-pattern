package com.tqz.pattern.iterator;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 15:44
 */
public interface Aggregate {

    void add(Object obj);
    
    void remove(Object obj);
    
    Iterator iterator();

}
