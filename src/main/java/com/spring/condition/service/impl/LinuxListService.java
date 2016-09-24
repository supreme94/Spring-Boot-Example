package com.spring.condition.service.impl;

import com.spring.condition.service.ListService;

public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}

}
