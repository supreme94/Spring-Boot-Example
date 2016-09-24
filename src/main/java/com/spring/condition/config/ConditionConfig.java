package com.spring.condition.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.spring.condition.LinuxCondition;
import com.spring.condition.WindowsCondition;
import com.spring.condition.service.ListService;
import com.spring.condition.service.impl.LinuxListService;
import com.spring.condition.service.impl.WindowsListService;

@Configuration
public class ConditionConfig {
	@Bean
	@Conditional({WindowsCondition.class})
	public ListService windows() {
		return new WindowsListService();
	}
	
	@Bean
	@Conditional({LinuxCondition.class})
	public ListService linux() {
		return new LinuxListService();
	}
}
