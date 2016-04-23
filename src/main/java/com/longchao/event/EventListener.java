package com.longchao.event;

import java.util.List;

/**
 * <p>
 *  事件监听类
 * </p>
 *
 * @author chuan.qing(zhu.longchao)
 * @version 1.0
 * @create 2016/4/23
 */
public abstract class EventListener {

    /**
     * 在初始化listener的同时注册listener
     */
    public EventListener(){
        EventDispatcher.getInstance().registerListener(this);
    }

    /**
     * 感兴趣的事件列表
     * @return
     */
    abstract public List<Class<? extends Event>> interest();

    /**
     * 处理事件
     * @param event
     */
    abstract public void onEvent(Event event);
}
