package com.tqz.pattern.chain.simple;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:21
 */
public interface Processor {
    
    void process(Product product, ProcessorChain processorChain);
}
