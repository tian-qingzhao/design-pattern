package com.tqz.pattern.iterator;

/**
 * <p>迭代器模式测试类
 *
 * @author tianqingzhao
 * @since 2023/2/8 15:50
 */
public class TestIterator {
    
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
