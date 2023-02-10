package com.tqz.pattern.bridge;

/**
 * <p>桥接模式测试类
 *
 * @author tianqingzhao
 * @since 2023/2/4 21:14
 */
public class TestBridge {
    
    public static void main(String[] args) {
        Video video = new Mp4();
        
        AbstractOperatingSystem system = new Windows(video);
        
        system.play("music");
    }
    
}
