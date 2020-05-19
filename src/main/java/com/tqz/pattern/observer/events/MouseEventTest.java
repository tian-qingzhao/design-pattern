package com.tqz.pattern.observer.events;

import com.tqz.pattern.observer.events.mouseevent.Mouse;
import com.tqz.pattern.observer.events.mouseevent.MouseEventCallback;
import com.tqz.pattern.observer.events.mouseevent.MouseEventType;

/**
 * @Author: tian
 * @Date: 2020/4/23 1:14
 * @Desc:
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();


    }
}
