package com.spring;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.amqp.Sender;
import com.spring.condition.service.ListService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private ListService listService;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(listService.showListCmd());
	}
	
	@Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
	
}
