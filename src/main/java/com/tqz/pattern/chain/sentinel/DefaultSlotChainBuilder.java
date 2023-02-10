package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 10:20
 */
public class DefaultSlotChainBuilder implements SlotChainBuilder {
    
    @Override
    public AbstractLinkedProcessorSlot build() {
        DefaultProcessorSlotChain chain = new DefaultProcessorSlotChain();
        
        chain.addLast(new DegradeSlot());
        chain.addLast(new FlowSlot());
        
        return chain;
    }
}
