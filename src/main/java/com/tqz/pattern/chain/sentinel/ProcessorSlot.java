package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:53
 */
public interface ProcessorSlot {
    
    void entry(Context context);
    
    void fireEntry(Context context);
    
    void exit(Context context);
    
    void fireExit(Context context);
}
