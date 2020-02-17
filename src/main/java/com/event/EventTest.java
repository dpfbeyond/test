package com.event;

public class EventTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.addApplicationListeners(event -> {
            Object source = event.getSource();
            if (source instanceof Integer) {
                int now = (int) source;
                System.out.println("检测到事件源" + now);
            }
        });
        applicationContext.addApplicationListeners(event -> {
            Object source = event.getSource();
            if (source instanceof String) {
                String now = (String) source;
                System.out.println("检测到事件源" + now);
            }
        });
        applicationContext.publishEvent(new ApplicationEvent("HELLO"));

    }
}
