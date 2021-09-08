package com.revature.employee.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Email {

	private String from;
	
	private String to;
	
	private String msg;
	
	
}
