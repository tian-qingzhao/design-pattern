package com.tqz.pattern.chain.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:22
 */
public class ProcessorChain {
    
    private List<Processor> processorList = new ArrayList<>();
    
    private int index = -1;
    
    public void addProcessor(Processor processor) {
        this.processorList.add(processor);
    }
    
    public void process(Product product) {
        if (index == processorList.size() - 1) {
            return;
        }
    
        Processor processor = processorList.get(++index);
        processor.process(product, this);
    }
}
