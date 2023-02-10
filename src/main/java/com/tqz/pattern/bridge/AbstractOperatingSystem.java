package com.tqz.pattern.bridge;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/4 21:12
 */
public abstract class AbstractOperatingSystem {
    
    protected Video video;
    
    public AbstractOperatingSystem(Video video) {
        this.video = video;
    }
    
    protected abstract void play(String fileName);
}
