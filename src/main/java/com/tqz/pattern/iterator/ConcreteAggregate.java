package com.tqz.pattern.iterator;

import java.util.LinkedList;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 15:48
 */
public class ConcreteAggregate implements Aggregate {
    
    private LinkedList<Object> list = new LinkedList<>();
    
    @Override
    public void add(Object obj) {
        list.add(obj);
    }
    
    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }
    
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
