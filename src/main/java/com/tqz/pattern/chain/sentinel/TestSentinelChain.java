package com.tqz.pattern.chain.sentinel;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 10:28
 */
public class TestSentinelChain {
    
    public static void main(String[] args) {
        Context context = new Context(11);
        
        Entry entry = null;
        try {
            entry = SphU.entry(context);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            if (entry != null) {
                entry.exit();
            }
        }
    }
}
