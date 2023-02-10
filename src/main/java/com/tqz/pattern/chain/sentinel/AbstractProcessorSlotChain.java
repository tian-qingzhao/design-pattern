package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 10:16
 */
public abstract class AbstractProcessorSlotChain extends AbstractLinkedProcessorSlot {
    
    protected abstract void addLast(AbstractLinkedProcessorSlot processorSlot);
    
}
