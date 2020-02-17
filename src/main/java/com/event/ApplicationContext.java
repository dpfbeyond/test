package com.event;

import java.util.HashSet;
import java.util.Set;

public class ApplicationContext {

    Set<ApplicationListener> listeners;

    public ApplicationContext() {
        this.listeners = new HashSet<>();
    }

    public void addApplicationListeners(ApplicationListener listener) {
        this.listeners.add(listener);
    }

    /**
     * 发布事件
     */
    public void publishEvent(ApplicationEvent event) {
        for (ApplicationListener listener : listeners) {
            listener.onApplicationEvent(event);
        }
    }
}
