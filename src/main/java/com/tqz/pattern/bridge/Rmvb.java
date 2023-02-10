package com.tqz.pattern.bridge;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/4 21:11
 */
public class Rmvb implements Video {
    
    @Override
    public void decode(String fileName) {
        System.out.println("Rmvb：" + fileName);
    }
}
