package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 10:22
 */
public class SphU {
    
    private static ProcessorSlot processorSlot = null;
    
    public static Entry entry(Context context) {
        ProcessorSlot chain = getChain();
        Entry entry = new Entry(context, chain);
        
        try {
            chain.entry(context);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return entry;
    }
    
    private static ProcessorSlot getChain() {
        if (processorSlot != null) {
            return processorSlot;
        }
        
        DefaultSlotChainBuilder builder = new DefaultSlotChainBuilder();
        processorSlot = builder.build();
        return processorSlot;
    }
    
}
