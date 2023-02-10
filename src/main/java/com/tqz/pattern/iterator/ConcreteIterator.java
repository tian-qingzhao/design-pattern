package com.tqz.pattern.iterator;

import java.util.LinkedList;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 15:43
 */
public class ConcreteIterator implements Iterator {
    
    LinkedList<Object> list;
    
    int index = 0;
    
    public ConcreteIterator(LinkedList<Object> list) {
        this.list = list;
    }
    
    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(index++);
        }
        
        return null;
    }
    
    @Override
    public boolean hasNext() {
        return list != null && index < list.size();
    }
    
    @Override
    public boolean remove() {
        list.remove(index);
        return true;
    }
}
