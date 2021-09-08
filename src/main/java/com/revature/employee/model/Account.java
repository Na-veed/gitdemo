package com.revature.employee.model;

import org.springframework.stereotype.Component;

@Component
public class Account {

	int balance = 100;
	
	public void withdraw(int amount) {
		System.out.println("withdraw is successful your balance is " + (balance - amount));
	}
	
	public void deposit(int amount) {
		System.out.println("Deposit is successful your balance is " + (balance + amount));
	}
}
