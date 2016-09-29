package com.spring.eventlisenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{
	private   Logger log = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);
	
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		SpringApplication springApplication = event.getSpringApplication();
		springApplication.setBannerMode(Mode.CONSOLE);
		log.info("==MyApplicationStartedEventListener==");
	}

}
