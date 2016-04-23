package com.longchao.event;

import java.util.List;

/**
 * <p>
 *  �¼�������
 * </p>
 *
 * @author chuan.qing(zhu.longchao)
 * @version 1.0
 * @create 2016/4/23
 */
public abstract class EventListener {

    /**
     * �ڳ�ʼ��listener��ͬʱע��listener
     */
    public EventListener(){
        EventDispatcher.getInstance().registerListener(this);
    }

    /**
     * ����Ȥ���¼��б�
     * @return
     */
    abstract public List<Class<? extends Event>> interest();

    /**
     * �����¼�
     * @param event
     */
    abstract public void onEvent(Event event);
}
