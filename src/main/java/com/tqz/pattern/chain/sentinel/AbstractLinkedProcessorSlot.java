package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:55
 */
public abstract class AbstractLinkedProcessorSlot implements ProcessorSlot {
    
    private AbstractLinkedProcessorSlot next;
    
    @Override
    public void fireEntry(Context context) {
        if (next != null) {
            next.entry(context);
        }
    }
    
    @Override
    public void fireExit(Context context) {
        if (next != null) {
            next.exit(context);
        }
    }
    
    public void setNext(AbstractLinkedProcessorSlot next) {
        this.next = next;
    }
}
