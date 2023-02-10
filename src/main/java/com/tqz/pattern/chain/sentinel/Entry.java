package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 10:23
 */
public class Entry {
    
    private Context context;
    
    private ProcessorSlot processorSlot;
    
    public Entry(Context context, ProcessorSlot processorSlot) {
        this.context = context;
        this.processorSlot = processorSlot;
    }
    
    public Context getContext() {
        return context;
    }
    
    public void setContext(Context context) {
        this.context = context;
    }
    
    public ProcessorSlot getProcessorSlot() {
        return processorSlot;
    }
    
    public void setProcessorSlot(ProcessorSlot processorSlot) {
        this.processorSlot = processorSlot;
    }
    
    public void exit() {
        processorSlot.exit(context);
    }
}
