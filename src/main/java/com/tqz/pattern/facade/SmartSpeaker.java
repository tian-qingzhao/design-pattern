package com.tqz.pattern.facade;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/6 8:36
 */
public class SmartSpeaker {
    
    private Fan fan;
    
    private Light light;
    
    private Tv tv;
    
    public SmartSpeaker() {
        this.fan = new Fan();
        this.light = new Light();
        this.tv = new Tv();
    }
    
    public void say(String msg) {
        if (msg.contains("起床")) {
            getUp();
        } else if (msg.contains("睡觉")) {
            sleep();
        } else {
            System.out.println("什么也不做");
        }
    }
    
    private void getUp() {
        System.out.println("起床");
        light.on();
        tv.on();
        fan.off();
    }
    
    private void sleep() {
        System.out.println("睡觉");
        light.off();
        tv.off();
        fan.on();
    }
}
