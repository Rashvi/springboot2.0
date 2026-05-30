package com.codingshuttle.rashvi.module1Introduciton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroducitonApplication implements CommandLineRunner {
//	@Autowired //field injeciton
//	 final NotificationService notificationService ;

//	  public  Module1IntroducitonApplication(@Qualifier("SMS") NotificationService notificationService){ //constructor dependency
//		 this.notificationService = notificationService;
//	 }
//	public  Module1IntroducitonApplication( NotificationService notificationService){ //constructor dependency
//			this.notificationService = notificationService;
//	}
@Autowired
Map<String,NotificationService> notificationServiceMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroducitonApplication.class, args);
	//	NotificationService notification = new EmailNotificaiton();
//		notificationService.sendingNotification("Testing");
	}
	@Override
	public void run(String... args) {
//		notificationService.sendingNotification("Testing");
		for(var notificationService : notificationServiceMap.entrySet()){
			System.out.println(notificationService.getKey());
			notificationService.getValue().sendingNotification("hello....");
		}
	}

}
