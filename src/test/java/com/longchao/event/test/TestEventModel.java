package com.longchao.event.test;

import com.longchao.event.EventDispatcher;

/**
 * <p>
 * </p>
 *
 * @author chuan.qing(zhu.longchao)
 * @version 1.0
 * @create 2016/4/23.
 */
public class TestEventModel {
    public static void main(String[] args){
        EventABListener abListener = new EventABListener();
        EventDispatcher.getInstance().fireEvent(new EventA());
        EventDispatcher.getInstance().fireEvent(new EventB());
    }
}
