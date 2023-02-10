package com.tqz.pattern.iterator;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 15:42
 */
public interface Iterator {
    
    Object next();
    
    boolean hasNext();
    
    boolean remove();
    
}
