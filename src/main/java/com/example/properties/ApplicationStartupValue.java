package com.example.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupValue implements ApplicationListener<ApplicationStartedEvent> {

    @Value("${test.username}")
    private String username;

    @Value("${test.password}")
    private String password;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("Value username = " + username);
        System.out.println("Value password = " + password);
    }

}
