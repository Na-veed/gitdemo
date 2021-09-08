package com.revature.employee.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	@Getter
	@Setter
	private  int  employeeId;

	@Getter
	@Setter
	private @NonNull String name;

	@Getter
	@Setter
	@Autowired
	private Email email;

}