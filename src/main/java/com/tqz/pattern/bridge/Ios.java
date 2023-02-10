package com.tqz.pattern.bridge;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/4 21:13
 */
public class Ios extends AbstractOperatingSystem {
    
    public Ios(Video video) {
        super(video);
    }
    
    @Override
    protected void play(String fileName) {
        video.decode(fileName);
    }
}
