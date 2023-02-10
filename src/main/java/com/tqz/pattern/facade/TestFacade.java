package com.tqz.pattern.facade;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/6 8:38
 */
public class TestFacade {
    
    public static void main(String[] args) {
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        
        smartSpeaker.say("睡觉");
    }
    
}
