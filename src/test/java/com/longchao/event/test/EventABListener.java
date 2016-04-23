package com.longchao.event.test;

import com.longchao.event.Event;
import com.longchao.event.EventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author chuan.qing(zhu.longchao)
 * @version 1.0
 * @create 2016/4/23.
 */
public class EventABListener extends EventListener{

    @Override
    public List<Class<? extends Event>> interest() {
        List<Class<? extends Event>> types = new ArrayList<Class<? extends Event>>();
        types.add(EventA.class);
        types.add(EventB.class);
        return types;
    }

    @Override
    public void onEvent(Event event) {
        if(event instanceof  EventA){
            System.out.println("Event A.....");
            return;
        }
        if(event instanceof  EventB){
            System.out.println("Event B.....");
            return;
        }


    }
}
