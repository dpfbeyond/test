package com.event;

import java.util.EventListener;

public interface ApplicationListener extends EventListener {
        void onApplicationEvent(ApplicationEvent event);
}
