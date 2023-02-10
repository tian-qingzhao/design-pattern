package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:57
 */
public class FlowSlot extends AbstractLinkedProcessorSlot {
    
    @Override
    public void entry(Context context) {
        System.out.println("执行【限流】逻辑");
        
        if (context.getCount() == 2) {
            throw new RuntimeException("【限流】逻辑故意抛出的异常");
        } else {
            System.out.println("【限流】逻辑执行成功");
        }
        
        fireEntry(context);
    }
    
    @Override
    public void exit(Context context) {
        System.out.println("【限流】逻辑执行退出");
        fireExit(context);
    }
}
