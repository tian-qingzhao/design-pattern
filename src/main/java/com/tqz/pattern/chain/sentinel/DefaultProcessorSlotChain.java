package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 10:17
 */
public class DefaultProcessorSlotChain extends AbstractProcessorSlotChain {
    
    private final AbstractLinkedProcessorSlot first = new AbstractLinkedProcessorSlot() {
        
        @Override
        public void entry(Context context) {
            fireEntry(context);
        }
        
        @Override
        public void exit(Context context) {
            fireExit(context);
        }
    };
    
    private AbstractLinkedProcessorSlot end = first;
    
    @Override
    protected void addLast(AbstractLinkedProcessorSlot next) {
        end.setNext(next);
        end = next;
    }
    
    @Override
    public void entry(Context context) {
        first.entry(context);
    }
    
    @Override
    public void exit(Context context) {
        first.exit(context);
    }
}
