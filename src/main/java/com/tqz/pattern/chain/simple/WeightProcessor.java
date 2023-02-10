package com.tqz.pattern.chain.simple;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:25
 */
public class WeightProcessor implements Processor {
    
    @Override
    public void process(Product product, ProcessorChain processorChain) {
        if (product.getWeight() > 50) {
            System.out.println("产品宽度超过50，不合格");
        } else {
            System.out.println("产品宽度小于等于50，合格");
        }
        
        processorChain.process(product);
    }
}
