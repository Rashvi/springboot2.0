package com.codingshuttle.rashvi.module1Introduciton;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
@Qualifier("Email")
//@ConditionalOnProperty(name = "property.type",havingValue = "email") //this will take priority over Qualifier
public class EmailNotificaiton implements NotificationService{
    @Override
    public void sendingNotification(String msg) {
        System.out.println("sending Email....."+msg);
    }
}
