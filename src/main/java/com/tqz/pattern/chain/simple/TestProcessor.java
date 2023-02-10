package com.tqz.pattern.chain.simple;

/**
 * <p>简单责任链模式测试类
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:27
 */
public class TestProcessor {
    
    public static void main(String[] args) {
        ProcessorChain chain = new ProcessorChain();
        
        chain.addProcessor(new HeightProcessor());
        chain.addProcessor(new WeightProcessor());
        
        chain.process(new Product(48, 61));
    }
    
}
