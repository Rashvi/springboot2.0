package com.codingshuttle.rashvi.module1Introduciton;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SMS")
//@ConditionalOnProperty(name = "property.type",havingValue = "sms")
public class SMSNotificaiton implements NotificationService{

    @Override
    public void sendingNotification(String msg) {
        System.out.println("sending SMS....."+msg);

    }
}
