package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	
}
